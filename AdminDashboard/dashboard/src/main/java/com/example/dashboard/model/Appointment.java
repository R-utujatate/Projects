package com.example.dashboard.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "appointments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Appointment {
    @Id
    private String id;
    private String doctorId;
    private String patientId;
    private String clinicId;
    private String appointmentTime;
    private String status;
}