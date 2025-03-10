package com.example.dashboard.controller;

import com.example.dashboard.model.*;
import com.example.dashboard.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clinics")
public class ClinicController {
    @Autowired
    private ClinicService clinicService;

    @GetMapping("/by-area/{area}")
    public ResponseEntity<List<Clinic>> getClinicsByArea(@PathVariable String area) {
        return ResponseEntity.ok(clinicService.getClinicsByArea(area));
    }

    @GetMapping("/search/{name}")
    public ResponseEntity<List<Clinic>> searchClinicsByName(@PathVariable String name) {
        return ResponseEntity.ok(clinicService.searchClinicsByName(name));
    }
}