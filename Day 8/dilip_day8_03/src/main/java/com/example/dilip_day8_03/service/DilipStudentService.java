package com.example.dilip_day8_03.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dilip_day8_03.model.DilipStudent;
import com.example.dilip_day8_03.repository.DilipStudentRepo;




@Service
public class DilipStudentService {
    @Autowired
    private DilipStudentRepo studentRepo;

    public boolean post(DilipStudent student)
    {
        try
        {
            studentRepo.save(student);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<DilipStudent> getAll()
    {
        return studentRepo.findAll();
    }

    public List<DilipStudent> getGreater(int marks)
    {
        return studentRepo.findByMarksGreaterThan(marks);
    }

    public List<DilipStudent> getLesser(int marks)
    {
        return studentRepo.findByMarksLessThan(marks);
    }
    
}
