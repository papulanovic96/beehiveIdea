package com.example.apiary.controller;

import com.example.apiary.entity.ActivityCalendar;
import com.example.apiary.entity.entityDTO.ActivityCalendarDTO;
import com.example.apiary.services.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/calendar")
public class ActivityController {

    @Autowired
    private ActivityService as;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public ResponseEntity<List<ActivityCalendarDTO>> findAll() {
        return new ResponseEntity<>(as.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<String> save(@RequestBody ActivityCalendarDTO d) {
        String a = as.save(d);
        return new ResponseEntity<>(a, HttpStatus.OK);
    }
}
