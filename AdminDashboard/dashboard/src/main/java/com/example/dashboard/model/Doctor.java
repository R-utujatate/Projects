package com.example.dashboard.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "doctors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Doctor {
    @Id
    private String id;
    private String name;
    private String specialization;
    private String clinicId;
    private String area;
    private List<String> availabilitySlots;
}