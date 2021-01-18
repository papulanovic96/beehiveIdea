package com.example.apiary.services;

import com.example.apiary.converter.ApiaryConverter;
import com.example.apiary.entity.Apiary;
import com.example.apiary.entity.entityDTO.ApiaryDTO;
import com.example.apiary.repository.ApiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiaryService {
    @Autowired
    private ApiaryRepository ar;

    public List<ApiaryDTO> findAll() {
        List<Apiary> oldList = ar.findAll();
        List<ApiaryDTO> newList = ApiaryConverter.fromEntityList(oldList, e-> ApiaryConverter.fromEntity(e));
        return newList;
    }

    public String save(ApiaryDTO apiary) {
        Apiary newApiary = ApiaryConverter.toEntity(apiary);
        ar.save(newApiary);
        return "Apiary successfully added.";
    }

    public String delete(ApiaryDTO apiary) {
        Apiary newApiary = ApiaryConverter.toEntity(apiary);
        if(!newApiary.getBeehives().isEmpty()) {
            return "Error";
        } else {
            ar.delete(newApiary);
            return "Apiary successfully deleted.";
        }
    }

    public ApiaryDTO findById(Long id) {
        Apiary newApiary = ar.findById(id).orElse(null);
        ApiaryDTO apiaryDTO = ApiaryConverter.fromEntity(newApiary);
        return apiaryDTO;
    }
}
