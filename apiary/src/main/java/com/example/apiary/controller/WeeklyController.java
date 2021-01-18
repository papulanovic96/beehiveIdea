package com.example.apiary.controller;

import com.example.apiary.entity.entityDTO.WeeklyReviewDTO;
import com.example.apiary.services.WeeklyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/weekly")
public class WeeklyController {

    @Autowired
    private WeeklyService ws;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public ResponseEntity<List<WeeklyReviewDTO>> findAll(){
        return new ResponseEntity<>(ws.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<String> save(@RequestBody WeeklyReviewDTO wr) {
        String newS = ws.save(wr);
        return new ResponseEntity<>(newS, HttpStatus.OK);
    }

}
