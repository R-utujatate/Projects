package com.example.dashboard.service;

import com.example.dashboard.model.*;
import com.example.dashboard.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> searchDoctorsByClinic(String clinicId) {
        return doctorRepository.findByClinicId(clinicId);
    }

    public List<Doctor> searchDoctorsByArea(String area) {
        return doctorRepository.findByArea(area);
    }

    public List<Doctor> searchDoctorsBySpecialization(String specialization) {
        return doctorRepository.findBySpecialization(specialization);
    }
}