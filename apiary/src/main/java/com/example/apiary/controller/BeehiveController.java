package com.example.apiary.controller;

import com.example.apiary.entity.Beehive;
import com.example.apiary.entity.entityDTO.BeehiveDTO;
import com.example.apiary.services.BeehiveService;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@Controller
@RequestMapping("/beehive")
public class BeehiveController {

    @Autowired
    private BeehiveService bs;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public ResponseEntity<List<BeehiveDTO>> findAll() {
        return new ResponseEntity<>(bs.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<String> save(@RequestBody BeehiveDTO d) {
        String a = bs.save(d);
        return new ResponseEntity<>(a, HttpStatus.OK);
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> delete(@PathVariable Long id) {
        BeehiveDTO beehiveDTO = bs.findById(id);
        String delete = bs.delete(beehiveDTO);
        return new ResponseEntity<>(delete, HttpStatus.OK);
    }
}
