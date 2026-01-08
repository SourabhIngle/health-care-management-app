package com.paymentprocessingsystem.demo.dto.requestDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateHospitalRequest {
    @NotBlank(message = "Hospital name is required")
    @Size(max = 100)
    private String name;

    @Size(max = 15, message = "Contact number must be max 15 digits")
    private String contactNumber;
}
