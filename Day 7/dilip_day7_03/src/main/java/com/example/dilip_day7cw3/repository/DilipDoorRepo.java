package com.example.dilip_day7cw3.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dilip_day7cw3.model.DilipDoor;

import java.util.List;

@Repository
public interface DilipDoorRepo extends JpaRepository<DilipDoor,Integer>{

    List<DilipDoor> findByDoorId(int doorId);
    List<DilipDoor> findByAccessType(String accessType);
    
}
