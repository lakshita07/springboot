package com.day7_ex3.day7_ex3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.day7_ex3.day7_ex3.model.Door;

@Repository
public interface DoorRepo extends JpaRepository<Door,Integer>{
    List<Door> findByAccessType(String accessType);
}