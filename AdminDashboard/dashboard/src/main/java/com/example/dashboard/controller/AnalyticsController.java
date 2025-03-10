package com.example.dashboard.controller;

import com.example.dashboard.model.*;
import com.example.dashboard.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/analytics")
public class AnalyticsController {
    @Autowired
    private AnalyticsService analyticsService;

    @GetMapping("/doctor-appointments/{doctorId}")
    public ResponseEntity<Long> countAppointmentsByDoctor(@PathVariable String doctorId) {
        return ResponseEntity.ok(analyticsService.countAppointmentsByDoctor(doctorId));
    }
}