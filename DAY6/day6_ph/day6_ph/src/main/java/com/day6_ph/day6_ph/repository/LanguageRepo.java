package com.day6_ph.day6_ph.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.day6_ph.day6_ph.model.Language;

@Repository
public interface LanguageRepo extends JpaRepository<Language,Integer>{
}
