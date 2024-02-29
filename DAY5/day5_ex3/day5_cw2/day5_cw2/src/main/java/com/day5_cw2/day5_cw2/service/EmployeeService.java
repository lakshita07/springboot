package com.day5_cw2.day5_cw2.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day5_cw2.day5_cw2.model.Employee;
import com.day5_cw2.day5_cw2.repository.EmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
    private final EmployeeRepo er;

    public EmployeeService(EmployeeRepo er) {
        this.er = er;
    }
    
    public Employee insert(Employee e)
    {
        return er.save(e);
    }
    public Employee update(Employee e)
    {
        return er.save(e);
    }
    public  boolean delete(int id)
    {
        er.deleteById(id);
        return true;
    }
}