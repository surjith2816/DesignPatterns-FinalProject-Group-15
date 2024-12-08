package com.medplus.Strategy;

import com.medplus.Medicine;

//15% discount
public class EmployeeDiscount implements DiscountAPI {
    double percentage=0.15;
    @Override
    public double calculatePrice(Medicine medicine) {
        return medicine.getMedicinePrice() * (1-percentage);
    }

}
