package com.example.dashboard.service;

import com.example.dashboard.model.*;
import com.example.dashboard.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClinicService {
    @Autowired
    private ClinicRepository clinicRepository;

    public List<Clinic> getClinicsByArea(String area) {
        return clinicRepository.findByArea(area);
    }

    public List<Clinic> searchClinicsByName(String name) {
        return clinicRepository.findByNameContainingIgnoreCase(name);
    }

    public List<Clinic> getClinicsBySpecialization(String specialization) {
        return clinicRepository.findBySpecializationsContaining(specialization);
    }

    public List<Clinic> getClinicsByDoctor(String doctorId) {
        return clinicRepository.findByDoctorsContaining(doctorId);
    }
}
