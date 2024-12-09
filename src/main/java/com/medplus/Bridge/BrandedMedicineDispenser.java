package com.medplus.Bridge;

import com.medplus.Medicine;
import com.medplus.Pharmacist;

public class BrandedMedicineDispenser implements MedicalService {
    private Medicine medicine;
    private Pharmacist pharmacist;

    public BrandedMedicineDispenser(Medicine medicine, Pharmacist pharmacist) {
        this.medicine = medicine;
        this.pharmacist = pharmacist;
    }

    public void dispenseMedicine() {
        pharmacist.dispense(medicine);
    }
}
