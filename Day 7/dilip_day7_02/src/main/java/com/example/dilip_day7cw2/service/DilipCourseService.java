package com.example.dilip_day7cw2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dilip_day7cw2.model.DilipCourse;
import com.example.dilip_day7cw2.repository.DilipCourseRepo;

@Service
public class DilipCourseService {
    @Autowired
    private DilipCourseRepo rep;

    public boolean post(DilipCourse person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<DilipCourse> getAll()
    {
        return rep.findAll();
    }

    public List<DilipCourse> getbyAge(String courseName)
    {
        return rep.findByCourseName(courseName);
    }
    
}
