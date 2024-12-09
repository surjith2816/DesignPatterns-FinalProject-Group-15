package com.medplus.Factory;

import com.medplus.Builder.BuilderAPI;
import com.medplus.Builder.PharmacistBuilder;
import com.medplus.Pharmacist;

public class PharmacistFactory extends AbstractFactory {
    private static PharmacistFactory instance = new PharmacistFactory();
    private PharmacistFactory(){
        super();
    }
    public synchronized static PharmacistFactory getInstance(){
        return instance;
    }
    @Override
    public Pharmacist getObject(BuilderAPI buildObject) {
        PharmacistBuilder pharmacistBuilder = (PharmacistBuilder) buildObject;
        return new Pharmacist(pharmacistBuilder);
    }
}
