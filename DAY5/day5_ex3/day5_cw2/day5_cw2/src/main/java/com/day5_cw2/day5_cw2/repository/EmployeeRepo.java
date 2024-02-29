package com.day5_cw2.day5_cw2.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.day5_cw2.day5_cw2.model.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
}