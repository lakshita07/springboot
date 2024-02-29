package com.day8_ex2.day8_ex2.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.day8_ex2.day8_ex2.model.Product;
import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{
    @Query("SELECT p from Product p WHERE p.productName like ?1%")
    List<Product> findByDistinctProductNameStartWithname(String name);
    
    @Query("SELECT p from Product p WHERE p.productName like %?1")
    List<Product> findByDistinctProductNameEndWithname(String name);
    
    @Query("SELECT p from Product p order by price")
    List<Product> findByDistinctProductsSortByPrice();

}
