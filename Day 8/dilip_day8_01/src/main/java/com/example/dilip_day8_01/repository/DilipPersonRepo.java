package com.example.dilip_day8_01.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dilip_day8_01.model.DilipPerson;

import java.util.List;


@Repository
public interface DilipPersonRepo extends JpaRepository<DilipPerson,Integer>{

    List<DilipPerson> findByNameStartingWith(String name);
    List<DilipPerson> findByNameEndingWith(String name);
    
}
