package com.day2_ph.day2_ph.controller;


import org.springframework.web.bind.annotation.RestController;

import com.day2_ph.day2_ph.config.StudentConfig;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class StudentController {
    @Autowired
    public StudentConfig configObject;
    @GetMapping("/info")
    public String getMethodName() {
        return "Student Name: "+configObject.getStudentName()+", Department: "+configObject.getStudentDepartment();
    }
    
}