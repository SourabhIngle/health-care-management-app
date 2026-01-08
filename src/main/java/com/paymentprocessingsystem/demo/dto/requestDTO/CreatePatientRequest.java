package com.paymentprocessingsystem.demo.dto.requestDTO;

import jakarta.validation.constraints.*;

import java.util.Date;

public class CreatePatientRequest {
    @NotBlank(message = "Patient code is required")
    private String patientCode;

    @NotBlank(message = "Patient name is required")
    @Size(max = 100)
    private String name;

    @Size(max = 10)
    private String gender;

    @Past(message = "Date of birth must be in the past")
    private Date dateOfBirth;

    @Size(max = 15)
    private String phone;

    @Email
    private String email;

    @Size(max = 200)
    private String address;

    @NotNull
    private Long hospitalId;
}
