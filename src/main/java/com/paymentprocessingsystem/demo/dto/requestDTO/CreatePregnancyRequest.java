package com.paymentprocessingsystem.demo.dto.requestDTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class CreatePregnancyRequest {
    @NotNull
    private Long patientId;

    @NotNull
    private Long hospitalId;

    @NotNull(message = "Start date is required")
    private Date startImpDate;

    private Date calculateAddDate;

    @Size(max = 50)
    private String pregnancyStatus;
}
