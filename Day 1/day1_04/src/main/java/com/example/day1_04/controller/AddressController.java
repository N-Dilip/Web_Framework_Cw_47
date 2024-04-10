package com.example.day1_04.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day1_04.model.Address;


@RestController
public class AddressController{
    @GetMapping("/address")
    public Address getMethod(){
        Address ad=new Address();
        ad.setName("Dilip");
        ad.setDoorNo(123);
        ad.setStreetName("Main St");
        ad.setPincode(605602);
        ad.setArea("summa");
        ad.setDistrict("villupuram");
        ad.setState("Tamil Nadu");
        ad.setCountry("India");
        return ad;
    }
}