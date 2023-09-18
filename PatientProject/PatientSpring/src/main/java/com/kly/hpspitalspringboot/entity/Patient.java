package com.kly.hpspitalspringboot.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.Date;

@Entity
@Getter
@Setter
public class Patient {
    @Id
    @SequenceGenerator(name = "hosp_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hosp_seq")
    private Long id;

    private String firstName;
    private String lastName;

    private Date birthDate;

}
