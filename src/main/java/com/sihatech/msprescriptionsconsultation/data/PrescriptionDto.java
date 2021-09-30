package com.sihatech.msprescriptionsconsultation.data;

import java.util.List;

public class PrescriptionDto {

    private List<Prescription> prescriptionList;

    public PrescriptionDto() {
    }

    public PrescriptionDto(List<Prescription> prescriptionList) {
        this.prescriptionList = prescriptionList;
    }

    public List<Prescription> getPrescriptionList() {
        return prescriptionList;
    }

    public void setPrescriptionList(List<Prescription> prescriptionList) {
        this.prescriptionList = prescriptionList;
    }
}
