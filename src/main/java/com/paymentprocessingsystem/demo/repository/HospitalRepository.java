package com.paymentprocessingsystem.demo.repository;

import com.paymentprocessingsystem.demo.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {
    boolean existsByName(String name);




}