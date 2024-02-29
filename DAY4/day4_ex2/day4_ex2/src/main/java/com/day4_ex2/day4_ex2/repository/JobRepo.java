package com.day4_ex2.day4_ex2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.day4_ex2.day4_ex2.model.Job;

@Repository
public interface JobRepo extends JpaRepository<Job,Integer>{

    
  
}