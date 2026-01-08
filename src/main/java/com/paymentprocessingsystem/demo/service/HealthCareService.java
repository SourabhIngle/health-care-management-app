package com.paymentprocessingsystem.demo.service;

import com.paymentprocessingsystem.demo.dto.requestDTO.CreateHospitalRequest;
import com.paymentprocessingsystem.demo.dto.responseDTO.HospitalDTO;
import com.paymentprocessingsystem.demo.entity.Hospital;
import com.paymentprocessingsystem.demo.repository.HospitalRepository;
import com.paymentprocessingsystem.demo.requestmapper.HospitalMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HealthCareService {

    private final HospitalRepository hospitalRepository;

    private final HospitalMapper hospitalMapper;

    //Create
    public HospitalDTO createHospital(CreateHospitalRequest hospitalRequest) {
        if (hospitalRepository.existsByName(hospitalRequest.getName())) {
            throw new IllegalStateException("Hospital name already exists");
        }
        Hospital hospital = hospitalMapper.toEntity(hospitalRequest);
        Hospital saved = hospitalRepository.save(hospital);
        return hospitalMapper.toDTO(saved);
    }

    //Read
    public List<HospitalDTO> getAllHospitals() {
        return hospitalRepository.findAll()
                .stream()
                .map(hospitalMapper::toDTO)
                .toList();
    }

    public HospitalDTO getHospitalById(Long id) {
        Hospital hospital = hospitalRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Hospital not found"));
        return hospitalMapper.toDTO(hospital);
    }

    //Update
    public HospitalDTO updateHospital(Long id, CreateHospitalRequest hospitalRequest) {
        Hospital hospital = hospitalRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Hospital not found"));

        if (hospitalRequest.getName() != null && !hospitalRequest.getName().equals(hospital.getName())) {
            if (hospitalRepository.existsByName(hospitalRequest.getName())) {
                throw new IllegalStateException("Hospital name already Existing");
            }
            hospital.setName(hospitalRequest.getName());
        }
        hospital.setContactNumber(hospitalRequest.getContactNumber());
        Hospital update = hospitalRepository.save(hospital);
        return hospitalMapper.toDTO(update);
    }

    //Delete
    public void deleteHospital(Long id) {
        if (!hospitalRepository.existsById(id)){
            throw new IllegalArgumentException("Hospital not found");
        }
        hospitalRepository.deleteById(id);
    }
}