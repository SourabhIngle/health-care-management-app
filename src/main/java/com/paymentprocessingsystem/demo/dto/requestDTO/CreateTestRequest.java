package com.paymentprocessingsystem.demo.dto.requestDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public class CreateTestRequest {
    @NotBlank(message = "Test name is required")
    @Size(max = 200)
    private String testName;

    @Size(max = 500)
    private String description;

    @Size(max = 50)
    private String category;

    @NotBlank(message = "Normal range is required")
    @Size(max = 100)
    private String normalRange;

    @PositiveOrZero
    private Double cost;
}
