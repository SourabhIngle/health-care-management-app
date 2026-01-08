package com.paymentprocessingsystem.demo.dto.responseDTO;

import java.util.Date;

public record DoctorDTO(Long id, String name, String specialization,
                        String phone, String email, boolean isActive,
                        HospitalDTO hospital, Date createdAt) {}
