package com.paymentprocessingsystem.demo.dto.requestDTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class CreateVisitRequest {
    @NotNull
    private Long hospitalId;

    @NotNull
    private Long patientId;

    @NotNull(message = "Visit date is required")
    private Date visitDate;

    @Size(max = 200)
    private String visitType;

    private Date nextVisitDate;

    @Size(max = 50)
    private String status;

    @Size(max = 200)
    private String note;

    @NotNull
    private Long pregnancyId;
}

