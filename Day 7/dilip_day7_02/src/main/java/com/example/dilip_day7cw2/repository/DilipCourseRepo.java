package com.example.dilip_day7cw2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dilip_day7cw2.model.DilipCourse;

import java.util.List;


@Repository
public interface DilipCourseRepo extends JpaRepository<DilipCourse,Integer>{

    List<DilipCourse> findByCourseName(String courseName);
    
}
