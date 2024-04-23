package com.example.dilip_day7cw1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dilip_day7cw1.model.DilipPerson;
import com.example.dilip_day7cw1.service.DilipPersonService;

import java.util.*;

@RestController
public class DilipPersonController {
    @Autowired
    private DilipPersonService ser;
    
    @PostMapping("/api/person")
    public ResponseEntity<DilipPerson> post(@RequestBody DilipPerson person)
    {
        if(ser.post(person))
        {
            return new ResponseEntity<>(person,HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/person")
    public ResponseEntity<List<DilipPerson>> getAll()
    {
        List<DilipPerson> li = ser.getAll();
        if(li.size()>0)
        {
            return new ResponseEntity<>(li,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/person/byAge")
    public ResponseEntity<List<DilipPerson>> getbyAge(@RequestParam int age)
    {
        List<DilipPerson> li = ser.getbyAge(age);
        if(li.size()>0)
        {
            return new ResponseEntity<>(li,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

