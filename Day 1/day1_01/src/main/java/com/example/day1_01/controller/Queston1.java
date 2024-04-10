package com.example.day1_01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Queston1 {
    @GetMapping("welcome")
    public String getMethod(){
        return "Welcome Spring Boot!";
    }
}
