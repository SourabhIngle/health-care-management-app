package com.paymentprocessingsystem.demo.dto.responseDTO;

import java.time.LocalDateTime;

public record HospitalDTO(Long id, String name, String contactNumber, LocalDateTime createdAt) {}

