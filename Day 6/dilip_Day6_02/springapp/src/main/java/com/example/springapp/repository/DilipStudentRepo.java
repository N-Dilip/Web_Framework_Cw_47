package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.model.DilipStudent;

@Repository
public interface DilipStudentRepo extends JpaRepository<DilipStudent, Integer> {
    
}
