package com.example.apiary.converter;

import com.example.apiary.entity.Apiary;
import com.example.apiary.entity.Beehive;
import com.example.apiary.entity.Beekeeper;
import com.example.apiary.entity.MonthlyMaintenance;
import com.example.apiary.entity.entityDTO.ApiaryDTO;
import com.example.apiary.repository.ApiaryRepository;
import com.example.apiary.repository.BeehiveRepository;
import com.example.apiary.repository.MonthMRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ApiaryConverter extends AbstractConverter {

    private static MonthMRepository mr;
    private static BeehiveRepository br;

    public ApiaryConverter(MonthMRepository a, BeehiveRepository b) {
        this.mr = a;
        this.br = b;
    }

    public static ApiaryDTO fromEntity(Apiary e) {
        ApiaryDTO apiaryDTO = new ApiaryDTO();
        if(e != null) {
            apiaryDTO.setId(e.getId());
            apiaryDTO.setBeehiveNumber(e.getBeehiveNumber());
            Collection<Beehive> beehives = e.getBeehives();
            List<Long> beehiveID = new ArrayList<>();
            if (beehives != null) {
                for (Beehive b : beehives) {
                    beehiveID.add(b.getId());
                }
            }
            apiaryDTO.setBeehivesDTO(beehiveID);
            apiaryDTO.setState(e.isState());
            Collection<MonthlyMaintenance> maintenance = e.getMaintenance();
            List<Long> maintenanceID = new ArrayList<>();
            if (maintenance != null) {
                for (MonthlyMaintenance m : maintenance) {
                    maintenanceID.add(m.getId());
                }
            }
            apiaryDTO.setMonthlyMDTO(maintenanceID);
            return apiaryDTO;
        } else
            return null;
    }

    public static Apiary toEntity(ApiaryDTO d) {
        Apiary apiary = new Apiary();
        if(d != null) {
            apiary.setBeehiveNumber(d.getBeehiveNumber());
            apiary.setId(d.getId());
            apiary.setState(d.isState());
            Collection<Beehive> newBeehives = new ArrayList<>();
            List<Long> oldIds = d.getBeehivesDTO();
            if (oldIds != null) {
                for (Long k : oldIds) {
                    newBeehives.add(br.getOne(k));
                }
            }
            apiary.setBeehives(newBeehives);
            Collection<MonthlyMaintenance> maintenanceC = new ArrayList<>();
            List<Long> oldM = d.getMonthlyMDTO();
            if (oldM != null) {
                for (Long k : oldM) {
                    maintenanceC.add(mr.getOne(k));
                }
            }
            apiary.setMaintenance(maintenanceC);
            return apiary;
        } else
            return null;
    }
}
