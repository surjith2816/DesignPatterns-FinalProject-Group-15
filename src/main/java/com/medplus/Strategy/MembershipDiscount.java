package com.medplus.Strategy;

import com.medplus.Medicine;

//10% discount
public class MembershipDiscount implements DiscountAPI {
    double percentage=0.10;
    @Override
    public double calculatePrice(Medicine medicine) {
        return medicine.getMedicinePrice() * (1-percentage);
    }
}
