package com.medplus.Strategy;

import com.medplus.Medicine;

//20% discount
public class StudentDiscount implements DiscountAPI {
    double percentage=0.20;
    @Override
    public double calculatePrice(Medicine medicine) {
        return medicine.getMedicinePrice() * (1-percentage);
    }
}
