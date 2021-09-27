package com.sihatech.msprescriptionsconsultation.service;

import com.sihatech.msprescriptionsconsultation.data.Prescription;
import com.sihatech.msprescriptionsconsultation.repository.PrescriptionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

    private PrescriptionRepository prescriptionRepository;

    public PrescriptionServiceImpl(PrescriptionRepository prescriptionRepository) {
        this.prescriptionRepository = prescriptionRepository;
    }

    @Override
    public List<Prescription> getPrescriptionsByConsultationId(UUID consultationId) {
        return prescriptionRepository.getPrescriptionsByConsultationId(consultationId);
    }

    @Override
    public Prescription addNewPrescription(Prescription prescription) {
        return prescriptionRepository.save(prescription);
    }


}
