package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Dilip_Door;
import com.examly.springapp.repository.Dilip_Repo;

@Service
public class Dilip_Service {
    @Autowired
    private Dilip_Repo doorRepo;

    public Dilip_Door postData(Dilip_Door door) {
        return doorRepo.save(door);
    }

    public List<Dilip_Door> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public Dilip_Door updateDetail(int doorid, Dilip_Door door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<Dilip_Door> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<Dilip_Door> getAllDetails() {

        return doorRepo.findAll();
    }

    public Dilip_Door getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}