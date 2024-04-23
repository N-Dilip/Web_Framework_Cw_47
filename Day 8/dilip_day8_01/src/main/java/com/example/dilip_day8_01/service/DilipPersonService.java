package com.example.dilip_day8_01.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dilip_day8_01.model.DilipPerson;
import com.example.dilip_day8_01.repository.DilipPersonRepo;




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

    public List<DilipPerson> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<DilipPerson> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}