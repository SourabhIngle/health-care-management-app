package com.paymentprocessingsystem.demo.repository;

import com.paymentprocessingsystem.demo.entity.Patient;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
    @NonNull
    Optional<Patient> findById(@NonNull Long aLong);


}
