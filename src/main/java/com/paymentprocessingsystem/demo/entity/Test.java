package com.paymentprocessingsystem.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tests")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false, length = 200)
    private String testName;

    @Column(length = 500)
    private String description;

    //Optional
    @Column(length = 50)
    private String category; // e.g., Blood, Imaging, Urine

    @Column(nullable = false, unique = true, length = 100)
    private String normalRange;

    @Column
    private Double cost;

}