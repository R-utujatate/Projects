package com.example.dashboard.controller;

import com.example.dashboard.model.*;
import com.example.dashboard.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("/by-doctor/{doctorId}")
    public ResponseEntity<List<Patient>> getPatientsByDoctor(@PathVariable String doctorId) {
        return ResponseEntity.ok(patientService.getPatientsByDoctor(doctorId));
    }
}