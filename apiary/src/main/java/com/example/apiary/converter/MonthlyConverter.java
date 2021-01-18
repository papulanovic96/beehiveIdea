package com.example.apiary.converter;

import com.example.apiary.entity.Apiary;
import com.example.apiary.entity.MonthlyMaintenance;
import com.example.apiary.entity.entityDTO.ApiaryDTO;
import com.example.apiary.entity.entityDTO.MonthlyMaintenanceDTO;
import com.example.apiary.repository.ApiaryRepository;
import com.example.apiary.services.ApiaryService;

public class MonthlyConverter extends AbstractConverter {

    private static ApiaryRepository ar;
    private static ApiaryService as;

    public MonthlyConverter(ApiaryRepository a, ApiaryService s) {
        this.ar = a;
        this.as = s;
    }

    public static MonthlyMaintenanceDTO fromEntity(MonthlyMaintenance e) {
        if(e != null) {
            MonthlyMaintenanceDTO maintenanceDTO = new MonthlyMaintenanceDTO();
            maintenanceDTO.setId(e.getId());
            maintenanceDTO.setMonthName(e.getMonthName());
            maintenanceDTO.setWorkDescription(e.getWorkDescription());
            Apiary apiary = e.getMonthInApiary();
            ApiaryDTO apiaryDTO = new ApiaryDTO();
            if(apiary != null) {
                apiaryDTO = as.findById(apiary.getId());
            }
            maintenanceDTO.setMonthInApiary(apiaryDTO);
            return maintenanceDTO;
        } else {
            return null;
        }
    }

    public static MonthlyMaintenance toEntity(MonthlyMaintenanceDTO d) {
        if(d != null){
            MonthlyMaintenance monthlyMaintenance = new MonthlyMaintenance();
            monthlyMaintenance.setId(d.getId());
            monthlyMaintenance.setMonthName(d.getMonthName());
            monthlyMaintenance.setWorkDescription(d.getWorkDescription());
            ApiaryDTO apiaryDTO = d.getMonthInApiary();
            Apiary apiary = new Apiary();
            if(apiaryDTO != null) {
                apiary = ar.findById(apiaryDTO.getId()).orElse(null);
            }
            monthlyMaintenance.setMonthInApiary(apiary);
            return monthlyMaintenance;
        } else {
            return null;
        }
    }
}
