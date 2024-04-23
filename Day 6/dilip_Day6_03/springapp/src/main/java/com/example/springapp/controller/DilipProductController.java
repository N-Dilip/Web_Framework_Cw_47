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

import com.example.springapp.model.DilipProduct;
import com.example.springapp.service.DilipProductService;

@RestController
public class DilipProductController {
    @Autowired
    private DilipProductService ser;

    @PostMapping("/api/product")
    public ResponseEntity<DilipProduct> abc(@RequestBody DilipProduct children) {
        if (ser.post(children)) {
            return new ResponseEntity<DilipProduct>(children, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/product/{offset}/{pagesize}")
    public ResponseEntity<List<DilipProduct>> vfg(@PathVariable int offset, @PathVariable int pagesize) {
        List<DilipProduct> li = ser.get2(offset, pagesize);
        if (!li.isEmpty()) {
            return new ResponseEntity<List<DilipProduct>>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/api/product/{offset}/{pagesize}/{field}")
    public ResponseEntity<List<DilipProduct>> abcf(@PathVariable int offset, @PathVariable int pagesize,
            @PathVariable String field) {
        List<DilipProduct> li = ser.get3(offset, pagesize, field);
        if (!li.isEmpty()) {
            return new ResponseEntity<List<DilipProduct>>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/api/product/{productId}")
    public ResponseEntity<DilipProduct> fgh(@PathVariable int productId)
    {
        DilipProduct pro = ser.get1(productId);
        if(pro==null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<DilipProduct>(pro,HttpStatus.OK);
        }
    }

}
