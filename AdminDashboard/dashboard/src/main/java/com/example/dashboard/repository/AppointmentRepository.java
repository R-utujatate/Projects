package com.example.dashboard.repository;

import com.example.dashboard.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AppointmentRepository extends MongoRepository<Appointment, String> {
    List<Appointment> findByDoctorId(String doctorId);
    List<Appointment> findByPatientId(String patientId);
    List<Appointment> findByClinicId(String clinicId);
    List<Appointment> findByAppointmentTimeBetween(String startTime, String endTime);
}