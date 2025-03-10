package com.example.dashboard.repository;

import com.example.dashboard.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DoctorRepository extends MongoRepository<Doctor, String> {
    List<Doctor> findByClinicId(String clinicId);
    List<Doctor> findByArea(String area);
    List<Doctor> findBySpecialization(String specialization);
}