package com.sihatech.msprescriptionsconsultation.service;

import com.sihatech.msprescriptionsconsultation.data.Prescription;
import com.sihatech.msprescriptionsconsultation.data.PrescriptionDto;

import java.util.List;
import java.util.UUID;

public interface PrescriptionService {


   PrescriptionDto getPrescriptionsByConsultationId(UUID consultationId);
   Prescription addNewPrescription(Prescription prescription);
}
