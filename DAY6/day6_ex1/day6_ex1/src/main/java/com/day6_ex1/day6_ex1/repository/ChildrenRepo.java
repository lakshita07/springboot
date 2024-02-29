package com.day6_ex1.day6_ex1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.day6_ex1.day6_ex1.model.Children;
@Repository


public interface ChildrenRepo extends JpaRepository<Children,Integer>{

}