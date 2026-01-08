package com.paymentprocessingsystem.demo.dto.responseDTO;

import java.util.Date;

public record VisitTestDTO(Long id, VisitDTO visit, TestDTO test,
                           String resultValue, String report,
                           String resultStatus, Date performedAt) {}

