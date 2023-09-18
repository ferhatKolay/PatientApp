package com.kly.hpspitalspringboot.service;

import com.kly.hpspitalspringboot.entity.Patient;
import java.util.List;
import java.util.Optional;

public interface PatientService {

    Patient save(Patient patient);

    List<Patient> getAll();

    Optional<Patient> get(Long id);

    void delete(Long id);
}
