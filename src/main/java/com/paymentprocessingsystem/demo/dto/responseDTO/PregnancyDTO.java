package com.paymentprocessingsystem.demo.dto.responseDTO;

import java.util.Date;

public record PregnancyDTO(Long id, PatientDTO patient, HospitalDTO hospital,
                           Date startImpDate, Date calculateAddDate,
                           String pregnancyStatus, Date createdAt) {}

