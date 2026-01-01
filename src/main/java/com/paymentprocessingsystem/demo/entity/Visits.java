package com.paymentprocessingsystem.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "visits")
public class Visits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "hospital_id", nullable = false)
    private Hospital hospital;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;


    @Temporal(TemporalType.TIMESTAMP)
    private Date visitDate;

    @Column(length = 200)
    private String visitType;  //New, FollowUp and Regular

    @Temporal(TemporalType.DATE)
    private Date nextVisitDate;

    @Temporal(TemporalType.DATE)
    private Date createAt;

    // Status should be a simple string (no @Temporal)
    @Column(length = 50)
    private String status;

    // Note is also text, so just a string column
    @Column(length = 200)
    private String note;

    // Pregnancy is an entity relationship, so use @ManyToOne
    @ManyToOne
    @JoinColumn(name = "pregnancy_id", nullable = false)
    private Pregnancy pregnancyId;


}
