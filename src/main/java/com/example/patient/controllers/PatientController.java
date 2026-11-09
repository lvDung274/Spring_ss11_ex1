package com.example.patient.controllers;

import com.example.patient.models.dto.req.PatientReq;
import com.example.patient.models.dto.response.ApiResponse;
import com.example.patient.models.services.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/patients")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @PostMapping
    public ResponseEntity<?> addPatient(@RequestBody PatientReq req) {
        return ResponseEntity.ok(
                ApiResponse.builder()
                        .status(HttpStatus.OK.name())
                        .message("Them moi thanh conbg!")
                        .data(patientService.addPatient(req))
                        .build()
        );
    }
}
