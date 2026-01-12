package com.paymentprocessingsystem.demo.repository;

import com.paymentprocessingsystem.demo.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {
    boolean existsByName(String name);


}