package com.kly.hpspitalspringboot.repository;

import com.kly.hpspitalspringboot.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PatientRepository extends JpaRepository<Patient, Long> {

}
