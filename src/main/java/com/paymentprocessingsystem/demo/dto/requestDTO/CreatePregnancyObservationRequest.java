package com.paymentprocessingsystem.demo.dto.requestDTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class CreatePregnancyObservationRequest {
    @NotNull
    private Long patientId;

    @NotNull
    private Long visitId;

    @NotNull(message = "Observation date is required")
    private Date impDate;

    private Date addDate;

    @Min(0)
    private Integer gestationalAgeWeeks;

    @Size(max = 500)
    private String remarks;
}


