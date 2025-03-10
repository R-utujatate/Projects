package com.example.dashboard.service;

import com.example.dashboard.model.*;
import com.example.dashboard.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient findPatientByEmail(String email) {
        return patientRepository.findByEmail(email);
    }

    public List<Patient> getPatientsByDoctor(String doctorId) {
        return patientRepository.findByDoctorId(doctorId);
    }
}