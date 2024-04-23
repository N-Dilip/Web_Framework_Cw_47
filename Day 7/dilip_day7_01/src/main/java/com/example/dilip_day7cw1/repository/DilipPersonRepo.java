package com.example.dilip_day7cw1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dilip_day7cw1.model.DilipPerson;

import java.util.List;


@Repository
public interface DilipPersonRepo extends JpaRepository<DilipPerson,Integer>{

    List<DilipPerson> findByAge(int age);
    
}
