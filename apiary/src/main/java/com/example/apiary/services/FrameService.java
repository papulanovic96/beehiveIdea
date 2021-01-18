package com.example.apiary.services;

import com.example.apiary.converter.FrameConverter;
import com.example.apiary.entity.Frame;
import com.example.apiary.entity.entityDTO.FrameDTO;
import com.example.apiary.repository.FrameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrameService {

    @Autowired
    private FrameRepository frameRepository;

    public FrameDTO findById(Long key) {
        if(key != null) {
            return FrameConverter.fromEntity(frameRepository.getOne(key));
        } else {
            return null;
        }
    }

    public List<FrameDTO> findAll() {
        List<Frame> frames = frameRepository.findAll();
        return FrameConverter.fromEntityList(frames, e -> FrameConverter.fromEntity(e));
    }

    public void save(FrameDTO frameDTO) {
        frameRepository.save(FrameConverter.toEntity(frameDTO));
    }

    public void delete(Long key) {
        frameRepository.delete(FrameConverter.toEntity(findById(key)));
    }
}
