package com.example.bidirection.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.model.DilipStudent;
import com.example.bidirection.model.DilipStudentInfo;
import com.example.bidirection.service.DilipStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class DilipStudentController {
    public DilipStudentService studentService;
    public DilipStudentController(DilipStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public DilipStudent postMethodName(@RequestBody DilipStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public DilipStudentInfo postMethodName(@RequestBody DilipStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<DilipStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}