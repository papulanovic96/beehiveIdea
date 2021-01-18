package com.example.apiary.services;

import com.example.apiary.converter.WaxFoundationConverter;
import com.example.apiary.entity.entityDTO.WaxFoundationDTO;
import com.example.apiary.repository.WaxFRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaxFoundationService {

    @Autowired
    private WaxFRepository waxFRepository;

    public WaxFoundationDTO findById(Long key) {
        if(key != null) {
            return WaxFoundationConverter.fromEntity(waxFRepository.getOne(key));
        } else {
            return null;
        }
    }

    public List<WaxFoundationDTO> findAll() {
        return WaxFoundationConverter.fromEntityList(waxFRepository.findAll(), e -> WaxFoundationConverter.fromEntity(e));
    }

    public void save(WaxFoundationDTO d) {
        waxFRepository.save(WaxFoundationConverter.toEntity(d));
    }

    public void delete(WaxFoundationDTO d) {
        waxFRepository.delete(WaxFoundationConverter.toEntity(d));
    }
}
