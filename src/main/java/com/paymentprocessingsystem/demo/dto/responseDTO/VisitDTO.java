package com.paymentprocessingsystem.demo.dto.responseDTO;

import java.util.Date;

public record VisitDTO(Long id, HospitalDTO hospital, PatientDTO patient,
                       Date visitDate, String visitType, Date nextVisitDate,
                       Date createdAt, String status, String note,
                       PregnancyDTO pregnancy) {}


