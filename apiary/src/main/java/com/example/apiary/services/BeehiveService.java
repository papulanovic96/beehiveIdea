package com.example.apiary.services;

import com.example.apiary.converter.BeehiveConverter;
import com.example.apiary.entity.Beehive;
import com.example.apiary.entity.entityDTO.BeehiveDTO;
import com.example.apiary.repository.BeehiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeehiveService {
    @Autowired
    private BeehiveRepository br;

    public List<BeehiveDTO> findAll() {
        List<Beehive> oldList = br.findAll();
        List<BeehiveDTO> newList = BeehiveConverter.fromEntityList(oldList, e -> BeehiveConverter.fromEntity(e));
        return newList;
    }
    public String save(BeehiveDTO d) {
        Beehive b = BeehiveConverter.toEntity(d);
        br.save(b);
        return "Beehive successfully added!";
    }
    public String delete(BeehiveDTO d) {
        Beehive b = BeehiveConverter.toEntity(d);
        br.delete(b);
        return "Beehive successfully deleted!";
    }
    public BeehiveDTO findById(Long id) {
        Beehive beehive = br.findById(id).orElse(null);
        BeehiveDTO beehiveDTO = BeehiveConverter.fromEntity(beehive);
        return beehiveDTO;
    }
}
