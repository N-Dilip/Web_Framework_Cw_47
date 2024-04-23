package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.DilipStudent;



@Repository
public interface DilipStudentRepository extends JpaRepository<DilipStudent,Integer>{
    
}
