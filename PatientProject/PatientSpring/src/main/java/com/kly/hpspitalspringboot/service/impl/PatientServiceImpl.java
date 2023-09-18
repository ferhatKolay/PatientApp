package com.kly.hpspitalspringboot.service.impl;

import com.kly.hpspitalspringboot.entity.Patient;
import com.kly.hpspitalspringboot.repository.PatientRepository;
import com.kly.hpspitalspringboot.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> getAll(){
        return patientRepository.findAll();
    }

    @Override
    public Patient save(Patient patient){
        return patientRepository.save(patient);
    }

    @Override
    public Optional<Patient> get(Long id){
        return patientRepository.findById(id);
    }

    @Override
    public void delete(Long id){
        patientRepository.deleteById(id);
    }
}
