package com.example.dashboard.repository;

import com.example.dashboard.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PatientRepository extends MongoRepository<Patient, String> {
    Patient findByEmail(String email);
    List<Patient> findByDoctorId(String doctorId);
}