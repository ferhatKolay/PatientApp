package com.kly.hpspitalspringboot.controller;

import com.kly.hpspitalspringboot.entity.Patient;
import com.kly.hpspitalspringboot.service.PatientService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/patient")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public List<Patient> getAll(){
        return patientService.getAll();
    }

    @GetMapping("/{id}")
    public Patient get(@PathVariable Long id){
        return patientService.get(id).orElseThrow(() -> new RuntimeException("Patient not found"));
    }

    @PostMapping
    public Patient create(@RequestBody Patient patient){
        return patientService.save(patient);
    }

    @PutMapping
    public Patient update(@RequestBody Patient patient){
        if(patient.getId() == null || patient.getId() <= 0) throw new RuntimeException("Patient Id is required!");
        return patientService.save(patient);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Long id){
        patientService.delete(id);
        return true;
    }



}
