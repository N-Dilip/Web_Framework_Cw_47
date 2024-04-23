package com.example.dilip_day8_03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dilip_day8_03.model.DilipStudent;

import java.util.List;


@Repository
public interface DilipStudentRepo extends JpaRepository<DilipStudent,Integer>{

    List<DilipStudent> findByMarksGreaterThan(int marks); 
    List<DilipStudent> findByMarksLessThan(int marks); 
}
