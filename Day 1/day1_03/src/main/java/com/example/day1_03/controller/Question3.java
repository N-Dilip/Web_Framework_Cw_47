package com.example.day1_03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question3 {
    @GetMapping("/favouriteColor")
    public String getMethod(@RequestParam String color){
        return "My favorite color is "+color+"!";
    }
}
