package com.day4_ph.day4_ph.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.day4_ph.day4_ph.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer>{
    
}