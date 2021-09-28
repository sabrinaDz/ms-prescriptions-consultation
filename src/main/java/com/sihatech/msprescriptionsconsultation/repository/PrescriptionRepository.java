package com.sihatech.msprescriptionsconsultation.repository;

import com.sihatech.msprescriptionsconsultation.data.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, UUID> {

    @Query("select p from Prescription p where p.consultationId = :consultationId")
    List<Prescription> getPrescriptionsByConsultationId(UUID consultationId);

    @Query("select p.info from Prescription p where p.id = :id")
    Prescription getInfoByPrescriptionId(UUID id);
}
