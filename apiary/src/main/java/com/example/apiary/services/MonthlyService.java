package com.example.apiary.services;

import com.example.apiary.converter.MonthlyConverter;
import com.example.apiary.entity.MonthlyMaintenance;
import com.example.apiary.entity.entityDTO.MonthlyMaintenanceDTO;
import com.example.apiary.repository.MonthMRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonthlyService {

    @Autowired
    private MonthMRepository mr;

    public MonthlyMaintenanceDTO findById(Long key) {
        if(key != null) {
            return MonthlyConverter.fromEntity(mr.getOne(key));
        } else {
            return null;
        }
    }

    public List<MonthlyMaintenanceDTO> findAll() {
        List<MonthlyMaintenance> maintenances = mr.findAll();
        return MonthlyConverter.fromEntityList(maintenances, e -> MonthlyConverter.fromEntity(e));
    }

    public void save(MonthlyMaintenanceDTO maintenanceDTO) { mr.save(MonthlyConverter.toEntity(maintenanceDTO)); }

    public void delete(Long key) { mr.delete(MonthlyConverter.toEntity(findById(key))); }

}
