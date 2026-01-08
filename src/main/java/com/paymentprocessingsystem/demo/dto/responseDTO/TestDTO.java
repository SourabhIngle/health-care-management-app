package com.paymentprocessingsystem.demo.dto.responseDTO;

public record TestDTO(Long id, String testName, String description,
                      String category, String normalRange, Double cost) {}
