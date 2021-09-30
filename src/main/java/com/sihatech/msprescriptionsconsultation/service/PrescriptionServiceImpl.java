package com.sihatech.msprescriptionsconsultation.service;

import com.sihatech.msprescriptionsconsultation.data.Prescription;
import com.sihatech.msprescriptionsconsultation.data.PrescriptionDto;
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
    public PrescriptionDto getPrescriptionsByConsultationId(UUID consultationId) {
        PrescriptionDto prescriptionDto=new PrescriptionDto();
        prescriptionDto.setPrescriptionList(prescriptionRepository.getPrescriptionsByConsultationId(consultationId));
        return prescriptionDto;
    }

    @Override
    public Prescription addNewPrescription(Prescription prescription) {
        return prescriptionRepository.save(prescription);
    }


}
