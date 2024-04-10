package com.example.day1_02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question2 {
    @GetMapping("/studentName")
    public String getMethod(@RequestParam String studentName){
        return "Welcome "+studentName +"!";
    }
}
