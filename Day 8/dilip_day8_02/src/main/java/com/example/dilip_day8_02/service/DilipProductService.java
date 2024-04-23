package com.example.dilip_day8_02.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.dilip_day8_02.model.DilipProduct;
import com.example.dilip_day8_02.repository.DilipProductRepo;

@Service
public class DilipProductService {
    @Autowired
    private DilipProductRepo rep;

    @SuppressWarnings("")
    public boolean post(DilipProduct person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<DilipProduct> start(String value)
    {
        return rep.findByProductNameStartingWith(value);
    }

    public List<DilipProduct> end(String value)
    {
        return rep.findByProductNameEndingWith(value);
    }
    public List<DilipProduct> sort()
    {
        return rep.findAll(Sort.by("price"));
    }
    
}
