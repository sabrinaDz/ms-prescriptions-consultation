package com.sihatech.msprescriptionsconsultation.controller;


import com.sihatech.msprescriptionsconsultation.data.Prescription;
import com.sihatech.msprescriptionsconsultation.service.PrescriptionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/prescriptions/")
@Slf4j
public class PrescriptionController {

    PrescriptionService prescriptionService;

    public PrescriptionController(PrescriptionService prescriptionService) {
        this.prescriptionService = prescriptionService;
    }

    @GetMapping("/prescriptionsByConsultationId/{consultationId}")
    public ResponseEntity<List<Prescription>> listPrescriptions(@PathVariable("consultationId") UUID consultationId){
        return new ResponseEntity<>(prescriptionService.getPrescriptionsByConsultationId(consultationId),
        HttpStatus.OK);
    }
}


