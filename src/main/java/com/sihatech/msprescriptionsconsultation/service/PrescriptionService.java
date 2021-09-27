package com.sihatech.msprescriptionsconsultation.service;

import com.sihatech.msprescriptionsconsultation.data.Prescription;

import java.util.List;
import java.util.UUID;

public interface PrescriptionService {

   List<Prescription> getPrescriptionsByConsultationId(UUID consultationId);
}
