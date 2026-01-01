package com.paymentprocessingsystem.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Example relationship: each patient belongs to a hospital
    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospitalId;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(length = 100)
    private String specialization;

    @Column(length = 15)
    private String phone;

    @Column(length = 100)
    private String email;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @Temporal(TemporalType.DATE)
    private Date createAt;
}