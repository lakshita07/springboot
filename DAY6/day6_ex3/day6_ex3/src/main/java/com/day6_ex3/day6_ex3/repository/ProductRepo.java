package com.day6_ex3.day6_ex3.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.day6_ex3.day6_ex3.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{
    
}