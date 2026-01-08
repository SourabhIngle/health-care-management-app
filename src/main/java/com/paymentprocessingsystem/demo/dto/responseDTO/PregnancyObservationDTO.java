package com.paymentprocessingsystem.demo.dto.responseDTO;

import java.util.Date;

public record PregnancyObservationDTO(Long id, PatientDTO patient, VisitDTO visit,
                                      Date impDate, Date addDate,
                                      Integer gestationalAgeWeeks, String remarks,
                                      Date createdAt) {}
