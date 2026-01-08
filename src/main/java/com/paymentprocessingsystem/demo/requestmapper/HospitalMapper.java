package com.paymentprocessingsystem.demo.requestmapper;

import com.paymentprocessingsystem.demo.dto.requestDTO.CreateHospitalRequest;
import com.paymentprocessingsystem.demo.dto.responseDTO.HospitalDTO;
import com.paymentprocessingsystem.demo.entity.Hospital;
import org.springframework.stereotype.Component;

@Component
public class HospitalMapper {

    public HospitalDTO toDTO(Hospital hospital) {
        return new HospitalDTO(
                hospital.getId(),
                hospital.getName(),
                hospital.getContactNumber(),
                hospital.getCreatedAt()
        );
    }

    public Hospital toEntity(CreateHospitalRequest request) {
        Hospital hospital = new Hospital();
        hospital.setName(request.getName());
        hospital.setContactNumber(request.getContactNumber());
        return hospital;
    }
}