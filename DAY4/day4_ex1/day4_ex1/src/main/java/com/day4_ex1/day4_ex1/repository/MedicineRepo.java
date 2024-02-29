package com.day4_ex1.day4_ex1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.day4_ex1.day4_ex1.model.Medicine;

@Repository
public interface MedicineRepo extends JpaRepository<Medicine,Integer>{
    
}