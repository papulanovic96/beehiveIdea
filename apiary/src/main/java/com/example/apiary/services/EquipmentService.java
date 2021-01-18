package com.example.apiary.services;

import com.example.apiary.converter.EquipmentConverter;
import com.example.apiary.entity.Equipment;
import com.example.apiary.entity.entityDTO.EquipmentDTO;
import com.example.apiary.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {

    @Autowired
    private EquipmentRepository er;

    public List<EquipmentDTO> findAll() {
        List<Equipment> newList = er.findAll();
        List<EquipmentDTO> dtoList = EquipmentConverter.fromEntityList(newList, e -> EquipmentConverter.fromEntity(e));
        return dtoList;
    }
}
