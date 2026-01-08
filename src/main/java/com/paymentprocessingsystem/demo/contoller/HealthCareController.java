package com.paymentprocessingsystem.demo.contoller;

import com.paymentprocessingsystem.demo.dto.requestDTO.CreateHospitalRequest;
import com.paymentprocessingsystem.demo.dto.responseDTO.HospitalDTO;
import com.paymentprocessingsystem.demo.entity.Hospital;
import com.paymentprocessingsystem.demo.service.HealthCareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hospitals")
public class HealthCareController {

        @Autowired
        private HealthCareService healthCareService;

        @PostMapping
        public ResponseEntity<?> createHospital(@RequestBody CreateHospitalRequest hospitalRequest) {
            try {
                HospitalDTO saved = healthCareService.createHospital(hospitalRequest);
                return ResponseEntity.status(HttpStatus.CREATED).body(saved);
            } catch (Exception e) {
                return ResponseEntity.badRequest().body(e.getMessage());
            }
        }
    }

