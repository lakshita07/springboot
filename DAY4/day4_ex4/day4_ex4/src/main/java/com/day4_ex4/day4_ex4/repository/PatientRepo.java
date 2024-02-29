package com.day4_ex4.day4_ex4.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.day4_ex4.day4_ex4.model.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Integer>{

    
  
}