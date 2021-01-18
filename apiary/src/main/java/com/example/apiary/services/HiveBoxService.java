package com.example.apiary.services;

import com.example.apiary.converter.HiveBoxConverter;
import com.example.apiary.entity.HiveBox;
import com.example.apiary.entity.entityDTO.HiveBoxDTO;
import com.example.apiary.repository.HiveBoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HiveBoxService {

    @Autowired
    private HiveBoxRepository hiveBoxRepository;

    public List<HiveBoxDTO> findAll() {
        List<HiveBox> hiveBoxes = hiveBoxRepository.findAll();
        return HiveBoxConverter.fromEntityList(hiveBoxes, e -> HiveBoxConverter.fromEntity(e));
    }

    public HiveBoxDTO findById(Long key) {
        if(key != null) {
            return HiveBoxConverter.fromEntity(hiveBoxRepository.findById(key).orElse(null));
        } else {
            return null;
        }
    }

    public String save(HiveBoxDTO hiveBoxDTO) {
        if(hiveBoxDTO != null) {
            hiveBoxRepository.save(HiveBoxConverter.toEntity(hiveBoxDTO));
            return "Hive box added successfully!";
        } else {
            return  "Hive box is not added because there is nothing to add!";
        }
    }

    public String delete(Long key) {
        if(key != null) {
            hiveBoxRepository.delete(HiveBoxConverter.toEntity(findById(key)));
            return "Hive box removed successfully!";
        } else {
            return "Hive box not removed!";
        }
    }
}
