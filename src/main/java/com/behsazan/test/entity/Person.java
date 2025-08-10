package com.behsazan.test.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "person_name")
    private String name;

    @Column(name = "person_birthdate")
    private Date birthDate;

    @Column(name = "person_phone")
    private String phone;

    @Column(name = "person_address")
    private String address;

    @Column(name = "person_ssn")
    private String ssn;

}
