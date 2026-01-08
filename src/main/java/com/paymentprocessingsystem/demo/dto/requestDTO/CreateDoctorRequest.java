package com.paymentprocessingsystem.demo.dto.requestDTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CreateDoctorRequest {
    @NotBlank(message = "Doctor name is required")
    @Size(max = 100)
    private String name;

    @Size(max = 100)
    private String specialization;

    @Size(max = 15)
    private String phone;

    @Email
    private String email;

    @NotNull
    private Long hospitalId;
}
