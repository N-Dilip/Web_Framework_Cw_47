package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.springapp.model.DilipChildren;
import com.example.springapp.repository.DilipChildrenRepo;

@Service
public class DilipChildrenService {
    @Autowired
    private DilipChildrenRepo rep;

    public boolean post(DilipChildren children)
    {
        try
        {
            rep.save(children);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    public List<DilipChildren> get1(String a)
    {
        return rep.findAll(Sort.by(Sort.Direction.ASC,a));
    }

    public List<DilipChildren> get2(int a,int b)
    {
        return rep.findAll(PageRequest.of(a, b)).getContent();
    }


    public List<DilipChildren> get3(int a,int b,String c)
    {
        return rep.findAll(PageRequest.of(a, b,Sort.by(Sort.Direction.ASC,c))).getContent();
    }

    
}
