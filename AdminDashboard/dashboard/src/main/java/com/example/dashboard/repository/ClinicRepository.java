package com.example.dashboard.repository;

import com.example.dashboard.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClinicRepository extends MongoRepository<Clinic, String> {
    List<Clinic> findByArea(String area);
    List<Clinic> findByNameContainingIgnoreCase(String name);
    List<Clinic> findBySpecializationsContaining(String specialization);
    List<Clinic> findByDoctorsContaining(String doctorId);
}