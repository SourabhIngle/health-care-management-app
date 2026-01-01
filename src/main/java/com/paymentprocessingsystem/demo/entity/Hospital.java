package com.paymentprocessingsystem.demo.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "hospital")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(length = 15)
    private String contactNumber;

    @Temporal(TemporalType.DATE)
    private Date createAt;
}
