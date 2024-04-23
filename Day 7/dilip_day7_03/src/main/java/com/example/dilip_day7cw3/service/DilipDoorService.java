package com.example.dilip_day7cw3.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dilip_day7cw3.model.DilipDoor;
import com.example.dilip_day7cw3.repository.DilipDoorRepo;

@Service
public class DilipDoorService {
    @Autowired
    private DilipDoorRepo rep;

    public boolean post(DilipDoor door)
    {
        try
        {
            rep.save(door);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<DilipDoor> getAll()
    {
        return rep.findAll();
    }

    public List<DilipDoor> getbyDoorId(int doorId)
    {
        return rep.findByDoorId(doorId);
    }
    public List<DilipDoor> getbyType(String type)
    {
        return rep.findByAccessType(type);
    }
    
}
