package com.example.apiary.controller;

import com.example.apiary.entity.entityDTO.EquipmentDTO;
import com.example.apiary.services.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/equipment")
public class EquipmentController {

    @Autowired
    private EquipmentService es;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public ResponseEntity<List<EquipmentDTO>> findAll() { return new ResponseEntity<>(es.findAll(), HttpStatus.OK); }


}
