package com.example.dashboard.service;

import com.example.dashboard.model.*;
import com.example.dashboard.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnalyticsService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    public long countAppointmentsByDoctor(String doctorId) {
        return appointmentRepository.findByDoctorId(doctorId).size();
    }

    public long countAppointmentsByClinic(String clinicId) {
        return appointmentRepository.findByClinicId(clinicId).size();
    }
}