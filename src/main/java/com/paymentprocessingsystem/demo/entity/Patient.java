package com.paymentprocessingsystem.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Past;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Example relationship: each patient belongs to a hospital
    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospitalId;

    @Column(nullable = false)
    private String patientCode; //Unique

    @Column(nullable = false, length = 100)
    private String name;

    @Column(length = 10)
    private String gender;

    @Past(message = "Date of birth must be in the past.")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @Column(length = 15)
    private String phone
            ;
    @Column(length = 100)
    private String email;

    @Column(length = 200)
    private String address;

    @Temporal(TemporalType.DATE)
    private Date createAt;
}