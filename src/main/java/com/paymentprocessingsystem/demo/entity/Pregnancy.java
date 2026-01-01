package com.paymentprocessingsystem.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "pregnancies")
public class Pregnancy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Link to patient (Many pregnancies can belong to one patient)
    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    // Link to hospital (Many pregnancies can belong to one hospital)
    @ManyToOne
    @JoinColumn(name = "hospital_id", nullable = false)
    private Hospital hospital;

    // Start date of pregnancy
    @Temporal(TemporalType.DATE)
    @Column(name = "start_imp_date", nullable = false)
    private Date startImpDate;

    // Calculated expected delivery date
    @Temporal(TemporalType.DATE)
    @Column(name = "calculate_add_date")
    private Date calculateAddDate;

    // Pregnancy status (e.g., Ongoing, Delivered, Miscarriage)
    @Column(name = "pregnancy_status", length = 50)
    private String pregnancyStatus;

    // Record creation timestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;
}
