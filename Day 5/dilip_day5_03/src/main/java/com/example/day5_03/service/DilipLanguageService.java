package com.example.day5_03.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day5_03.model.DilipLanguage;
import com.example.day5_03.repository.DilipLanguageRepo;

@Service
public class DilipLanguageService {
    private DilipLanguageRepo languageRepo;
    public DilipLanguageService(DilipLanguageRepo languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(DilipLanguage language)
    {
        try
        {
            languageRepo.save(language);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<DilipLanguage> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,DilipLanguage language)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        languageRepo.deleteById(id);
        return true;
        
    }
    public DilipLanguage getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
