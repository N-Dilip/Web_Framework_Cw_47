package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.model.DilipChildren;

@Repository
public interface DilipChildrenRepo extends JpaRepository<DilipChildren,Integer>{
    
}
