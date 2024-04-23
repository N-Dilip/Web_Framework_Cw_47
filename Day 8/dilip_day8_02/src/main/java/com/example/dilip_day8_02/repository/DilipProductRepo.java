package com.example.dilip_day8_02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dilip_day8_02.model.DilipProduct;

import java.util.List;


@Repository
public interface DilipProductRepo extends JpaRepository<DilipProduct,Integer>{

    List<DilipProduct> findByProductNameStartingWith(String name);
    List<DilipProduct> findByProductNameEndingWith(String name);
    
}