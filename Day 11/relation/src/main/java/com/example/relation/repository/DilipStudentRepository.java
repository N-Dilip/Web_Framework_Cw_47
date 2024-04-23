package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.model.DilipStudent;

@Repository
public interface DilipStudentRepository extends JpaRepository<DilipStudent,Integer>{
    
}
