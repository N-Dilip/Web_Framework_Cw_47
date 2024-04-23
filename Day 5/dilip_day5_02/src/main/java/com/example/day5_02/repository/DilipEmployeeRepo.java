package com.example.day5_02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5_02.model.DilipEmployee;


@Repository
public interface DilipEmployeeRepo extends JpaRepository<DilipEmployee,Integer>{
    
}
