package com.sihatech.msprescriptionsconsultation.controller;


import com.sihatech.msprescriptionsconsultation.data.Prescription;
import com.sihatech.msprescriptionsconsultation.data.PrescriptionDto;
import com.sihatech.msprescriptionsconsultation.service.PrescriptionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/prescriptions")
@Slf4j
public class PrescriptionController {

    PrescriptionService prescriptionService;

    public PrescriptionController(PrescriptionService prescriptionService) {
        this.prescriptionService = prescriptionService;
    }

    @GetMapping("/prescriptionsByConsultationId/{consultationId}")
    public ResponseEntity<PrescriptionDto> listPrescriptions(@PathVariable("consultationId") UUID consultationId){
        return new ResponseEntity<>(prescriptionService.getPrescriptionsByConsultationId(consultationId),
        HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Prescription addNewPrescription(@RequestBody Prescription prescription){
               return prescriptionService.addNewPrescription(prescription);
    }
}


