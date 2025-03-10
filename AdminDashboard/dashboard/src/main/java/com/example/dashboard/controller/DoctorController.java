package com.example.dashboard.controller;

import com.example.dashboard.model.*;
import com.example.dashboard.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping("/by-clinic/{clinicId}")
    public ResponseEntity<List<Doctor>> getDoctorsByClinic(@PathVariable String clinicId) {
        return ResponseEntity.ok(doctorService.searchDoctorsByClinic(clinicId));
    }

    @GetMapping("/by-area/{area}")
    public ResponseEntity<List<Doctor>> getDoctorsByArea(@PathVariable String area) {
        return ResponseEntity.ok(doctorService.searchDoctorsByArea(area));
    }

    @GetMapping("/by-specialization/{specialization}")
    public ResponseEntity<List<Doctor>> getDoctorsBySpecialization(@PathVariable String specialization) {
        return ResponseEntity.ok(doctorService.searchDoctorsBySpecialization(specialization));
    }
}
