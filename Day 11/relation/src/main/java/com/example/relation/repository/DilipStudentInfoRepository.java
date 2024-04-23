package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.model.DilipStudentInfo;

@Repository
public interface DilipStudentInfoRepository extends JpaRepository<DilipStudentInfo,Integer>{
    
}