package com.examly.springapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Dilip_Door;

// import jakarta.transaction.Transactiona

@Repository
public interface Dilip_Repo extends JpaRepository<Dilip_Door, Integer> {

    @Query(value = "DELETE FROM Door WHERE Door_id = ?1", nativeQuery = true)
    void deleteDoor(int DoorId);

    public List<Dilip_Door> findByColor(String color);

    public List<Dilip_Door> findByDoorType(String doortype);
}
