package com.paymentprocessingsystem.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "visit_tests")
public class VisitTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Each test belongs to a visit
    @ManyToOne
    @JoinColumn(name = "visit_id", nullable = false)
    private Visits visit;

    // Reference to the test catalog
    @ManyToOne
    @JoinColumn(name = "test_id", nullable = false)
    private Test test;

    @Column(length = 200)
    private String resultValue;

    @Column(length = 200)
    private String report;

    @Column(length = 50)
    private String resultStatus; // e.g., Pending, Completed

    @Temporal(TemporalType.TIMESTAMP)
    private Date performedAt;

}