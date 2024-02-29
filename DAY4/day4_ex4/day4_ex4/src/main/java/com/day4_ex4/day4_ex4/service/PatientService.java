package com.day4_ex4.day4_ex4.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.day4_ex4.day4_ex4.model.Patient;
import com.day4_ex4.day4_ex4.repository.PatientRepo;

@Service
public class PatientService {

    private final PatientRepo patientRepo;

    
    public PatientService(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }

    public Patient createPatient(Patient patient) {
        return patientRepo.save(patient);
    }

    public List<Patient> getAllPatients() {
        return patientRepo.findAll();
    }

    public Patient getPatientById(int patientId) {
        return patientRepo.findById(patientId).orElse(null);
    }
}