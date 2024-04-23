package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.DilipStudentInfo;

@Repository
public interface DilipStudentInfoRepository extends JpaRepository<DilipStudentInfo,Integer>{
    
}