package com.paymentprocessingsystem.demo.dto.responseDTO;

import java.util.Date;

public record PatientDTO(Long id, String patientCode, String name, String gender,
                         Date dateOfBirth, String phone, String email,
                         String address, HospitalDTO hospital, Date createdAt) {}

