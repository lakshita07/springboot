package com.day5_ex1.day5_ex1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.day5_ex1.day5_ex1.model.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    
}