package com.paymentprocessingsystem.demo.dto.requestDTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class CreateVisitTestRequest {
    @NotNull
    private Long visitId;

    @NotNull
    private Long testId;

    @Size(max = 200)
    private String resultValue;

    @Size(max = 200)
    private String report;

    @Size(max = 50)
    private String resultStatus;

    private Date performedAt;
}
