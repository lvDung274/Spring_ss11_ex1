package com.example.patient.models.services;

import com.example.patient.models.dto.req.PatientReq;
import com.example.patient.models.entities.Patient;

public interface PatientService {
    Patient addPatient(PatientReq req);
}
