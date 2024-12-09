package com.medplus.Bridge;

import com.medplus.Medicine;
import com.medplus.Pharmacist;

public class GenericMedicineDispenser implements MedicalService {
    private Medicine medicine;
    private Pharmacist pharmacist;

    public GenericMedicineDispenser(Medicine medicine, Pharmacist pharmacist) {
        this.medicine = medicine;
        this.pharmacist = pharmacist;
    }

    public void dispenseMedicine() {
        System.out.println("Dispensing generic medicine " + medicine.getMedicineName());
        pharmacist.dispense(medicine);
    }
}
