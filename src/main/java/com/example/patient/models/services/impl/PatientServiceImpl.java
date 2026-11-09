package com.example.patient.models.services.impl;

import com.example.patient.exceptions.InvalidAgeException;
import com.example.patient.models.dto.req.PatientReq;
import com.example.patient.models.entities.Patient;
import com.example.patient.models.repositories.PatientRepository;
import com.example.patient.models.services.PatientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {
    private final PatientRepository patientRepository;

    @Override
    public Patient addPatient(PatientReq req) {
        if (req.age() >120){
            log.warn("Bệnh nhân phải nhỏ hơn 120 tuổi");
            throw new InvalidAgeException("Tuổi phải bé hơn 120");
        }
        Patient patient = Patient.builder()
                .name(req.name())
                .age(req.age())
                .build();
        return  patientRepository.save(patient);
    }
}
