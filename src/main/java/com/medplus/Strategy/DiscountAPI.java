package com.medplus.Strategy;

import com.medplus.Medicine;

@FunctionalInterface
public interface DiscountAPI {
    public double calculatePrice(Medicine medicine);
}
