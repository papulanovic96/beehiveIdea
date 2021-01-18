package com.example.apiary.services;

import com.example.apiary.converter.BeekeeperConverter;
import com.example.apiary.entity.Beekeeper;
import com.example.apiary.entity.entityDTO.BeekeeperDTO;
import com.example.apiary.repository.BeekeeperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeekeeperService {

    @Autowired
    private BeekeeperRepository beekeeperRepository;

    public List<BeekeeperDTO> findAll() {
        List<Beekeeper> entityList = beekeeperRepository.findAll();
        List<BeekeeperDTO> dtoList = BeekeeperConverter.fromEntityList(entityList, e -> BeekeeperConverter.fromEntity(e));
        return dtoList;
    }

    public String save(BeekeeperDTO d) {
        if(d != null) {
            Beekeeper entityBeekeeper = BeekeeperConverter.toEntity(d);
            beekeeperRepository.save(entityBeekeeper);
            return "Beekeeper added successfully!";
        } else {
            return "Beekeeper not added!";
        }
    }

    public BeekeeperDTO findById(Long key) {
        Beekeeper entityBeekeeper = beekeeperRepository.findById(key).orElse(null);
        return BeekeeperConverter.fromEntity(entityBeekeeper);

    }

    public String delete(Long key) {
        Beekeeper entityBeekeeper = beekeeperRepository.findById(key).orElse(null);
        beekeeperRepository.delete(entityBeekeeper);
        return "Beekeeper deleted successfully!";
    }

}
