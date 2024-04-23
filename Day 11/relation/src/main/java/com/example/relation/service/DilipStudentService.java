package com.example.relation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.model.DilipStudent;
import com.example.relation.repository.DilipStudentRepository;

@Service
public class DilipStudentService {
    public DilipStudentRepository studentRepository;
    public DilipStudentService(DilipStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public DilipStudent saveStudent(DilipStudent student)
    {
        return studentRepository.save(student);
    }
    public List<DilipStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
