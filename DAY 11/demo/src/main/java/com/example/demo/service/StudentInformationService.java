package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.StudentInformation;
import com.example.demo.repository.StudentInformationRepository;

@Service
public class StudentInformationService {
    
    @Autowired
    private StudentInformationRepository studentInformationRepository;

    public StudentInformation create(StudentInformation studentInformation) {
        return studentInformationRepository.save(studentInformation);
    }
}