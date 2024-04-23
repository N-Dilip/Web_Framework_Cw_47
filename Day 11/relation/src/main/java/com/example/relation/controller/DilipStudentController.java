package com.example.relation.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.model.DilipStudent;
import com.example.relation.service.DilipStudentService;
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
    @PostMapping("/api/student")
    public DilipStudent postMethodName(@RequestBody DilipStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<DilipStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
