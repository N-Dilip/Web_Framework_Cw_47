package com.example.bidirection.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.model.DilipStudent;
import com.example.bidirection.model.DilipStudentInfo;
import com.example.bidirection.repository.DilipStudentInfoRepository;
import com.example.bidirection.repository.DilipStudentRepository;

@Service
public class DilipStudentService {
    public DilipStudentRepository studentRepository;
    public DilipStudentInfoRepository studentInfoRepository;
    public DilipStudentService(DilipStudentRepository studentRepository,DilipStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public DilipStudent saveStudent(DilipStudent student)
    {
        return studentRepository.save(student);
    }
    public DilipStudentInfo saveStudentInfo(DilipStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<DilipStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
