package com.day5_ex3.day5_ex3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day5_ex3.day5_ex3.model.Language;

public interface LanguageRepo extends JpaRepository<Language,Integer>{
    
}