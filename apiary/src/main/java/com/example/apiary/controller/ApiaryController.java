package com.example.apiary.controller;

import com.example.apiary.entity.Apiary;
import com.example.apiary.entity.entityDTO.ApiaryDTO;
import com.example.apiary.services.ApiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/apiary")
public class ApiaryController {

    @Autowired
    private ApiaryService as;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public ResponseEntity<List<ApiaryDTO>> findAll() {
        List<ApiaryDTO> apiaryList = as.findAll();
        return new ResponseEntity<>(apiaryList, HttpStatus.OK);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<String> save(@RequestBody ApiaryDTO a) {
        String ab = as.save(a);
        return new ResponseEntity<String>(ab, HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> delete(@PathVariable Long id) {
        ApiaryDTO ap  = as.findById(id);
        if(ap != null){
            String ab = as.delete(ap);
            return new ResponseEntity<>(ab, HttpStatus.OK);
        } else
            return new ResponseEntity<>("Apiary not found!", HttpStatus.NOT_FOUND);
    }
}
