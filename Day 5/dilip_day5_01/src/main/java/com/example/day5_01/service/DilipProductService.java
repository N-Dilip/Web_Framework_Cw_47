package com.example.day5_01.service;

import org.springframework.stereotype.Service;

import com.example.day5_01.model.DilipProduct;
import com.example.day5_01.repository.DilipProductRepo;

@Service
public class DilipProductService {
    public DilipProductRepo productRepo;
    public DilipProductService(DilipProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(DilipProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,DilipProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public DilipProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
