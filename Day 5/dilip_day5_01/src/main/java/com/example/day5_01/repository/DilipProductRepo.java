package com.example.day5_01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5_01.model.DilipProduct;

@Repository
public interface DilipProductRepo extends JpaRepository<DilipProduct,Integer>{
    
}
