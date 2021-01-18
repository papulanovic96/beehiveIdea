package com.example.apiary.converter;

import com.example.apiary.entity.Equipment;
import com.example.apiary.entity.entityDTO.EquipmentDTO;

public class EquipmentConverter extends AbstractConverter {

    public static EquipmentDTO fromEntity(Equipment e) {
        if(e != null) {
            EquipmentDTO equipmentDTO = new EquipmentDTO();
            equipmentDTO.setId(e.getId());
            equipmentDTO.setName(e.getName());
            equipmentDTO.setQuantity(e.getQuantity());
            equipmentDTO.setUrl(e.getUrl());
            return equipmentDTO;
        } else {
            return null;
        }
    }

    public static Equipment toEntity(EquipmentDTO d) {
        if(d != null) {
            Equipment equipment = new Equipment();
            equipment.setId(d.getId());
            equipment.setName(d.getName());
            equipment.setQuantity(d.getQuantity());
            equipment.setUrl(d.getUrl());
            return equipment;
        } else {
            return null;
        }
    }
}
