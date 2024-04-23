package com.example.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.DilipChildren;
import com.example.springapp.service.DilipChildrenService;

@RestController
public class DilipChildrenController {
    @Autowired
    private DilipChildrenService ser;

    @PostMapping("/api/children")
    public ResponseEntity<DilipChildren> abc(@RequestBody DilipChildren children)
    {
        if(ser.post(children))
        {
            return new ResponseEntity<DilipChildren>(children,HttpStatus.CREATED);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/children/sortBy/{field}")
    public ResponseEntity<List<DilipChildren>> xyz (@PathVariable String field)
    {
        List<DilipChildren> li = ser.get1(field);
        if(li.size()>0)
        {
            return new ResponseEntity<List<DilipChildren>>(li,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping("/api/children/{offset}/{pagesize}")
    public ResponseEntity<List<DilipChildren>> vfg(@PathVariable int offset,@PathVariable int pagesize)
    {
        List<DilipChildren> li = ser.get2(offset,pagesize);
        if(!li.isEmpty())
        {
            return new ResponseEntity<List<DilipChildren>>(li,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/api/children/{offset}/{pagesize}/{field}")
    public ResponseEntity<List<DilipChildren>> abcf(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field)
    {
        List<DilipChildren> li = ser.get3(offset, pagesize, field);
        if(!li.isEmpty())
        {
            return new ResponseEntity<List<DilipChildren>>(li,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }
    
}
