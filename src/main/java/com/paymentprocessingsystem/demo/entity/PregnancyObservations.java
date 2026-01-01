package com.paymentprocessingsystem.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "pregnancy_observations")
public class PregnancyObservations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Link to patient
    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    // Link to visit
    @ManyToOne
    @JoinColumn(name = "visit_id", nullable = false)
    private Visits visit;

    // Important date (observation date)
    @Temporal(TemporalType.DATE)
    @Column(name = "imp_date", nullable = false)
    private Date impDate;

    // Additional date (e.g., follow-up or calculated date)
    @Temporal(TemporalType.DATE)
    @Column(name = "add_date")
    private Date addDate;

    // Gestational age in weeks
    @Column(name = "gestational_age_weeks")
    private Integer gestationalAgeWeeks;

    // Doctor’s remarks or notes
    @Column(length = 500)
    private String remarks;

    // Record creation timestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;
}
