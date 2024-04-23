package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.model.Product;

@Repository
public interface DilipProductRepo extends JpaRepository<Product,Integer>{
    
}
