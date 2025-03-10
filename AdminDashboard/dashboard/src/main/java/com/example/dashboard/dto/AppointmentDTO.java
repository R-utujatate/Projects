package com.example.dashboard.dto;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppointmentDTO {
    private String doctorId;
    private String patientId;
    private String clinicId;
    private String appointmentTime;
    private String status;
}
