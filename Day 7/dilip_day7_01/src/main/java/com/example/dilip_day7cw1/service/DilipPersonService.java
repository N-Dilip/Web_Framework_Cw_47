package com.example.dilip_day7cw1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dilip_day7cw1.model.DilipPerson;
import com.example.dilip_day7cw1.repository.DilipPersonRepo;


@Service
public class DilipPersonService {
    @Autowired
    private DilipPersonRepo rep;

    public boolean post(DilipPerson person)
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

    public List<DilipPerson> getAll()
    {
        return rep.findAll();
    }

    public List<DilipPerson> getbyAge(int age)
    {
        return rep.findByAge(age);
    }
    
}
