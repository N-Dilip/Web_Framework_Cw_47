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

import com.example.springapp.model.DilipEmployee;
import com.example.springapp.service.DilipEmployeeService;

@RestController
public class DilipEmployeeController {
    @Autowired
    private DilipEmployeeService ser;

    @PostMapping("/api/employee")
    public ResponseEntity<DilipEmployee> abc(@RequestBody DilipEmployee employee)
    {
        if(ser.post(employee))
        {
            return new ResponseEntity<DilipEmployee>(employee,HttpStatus.CREATED);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/employee/sortBy/{field}")
    public ResponseEntity<List<DilipEmployee>> xyz (@PathVariable String field)
    {
        List<DilipEmployee> li = ser.get1(field);
        if(li.size()>0)
        {
            return new ResponseEntity<List<DilipEmployee>>(li,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping("/api/employee/{offset}/{pagesize}")
    public ResponseEntity<List<DilipEmployee>> vfg(@PathVariable int offset,@PathVariable int pagesize)
    {
        List<DilipEmployee> li = ser.get2(offset,pagesize);
        if(!li.isEmpty())
        {
            return new ResponseEntity<List<DilipEmployee>>(li,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/api/employee/{offset}/{pagesize}/{field}")
    public ResponseEntity<List<DilipEmployee>> abcf(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field)
    {
        List<DilipEmployee> li = ser.get3(offset, pagesize, field);
        if(!li.isEmpty())
        {
            return new ResponseEntity<List<DilipEmployee>>(li,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }
    
}
