package com.medplus.Command;

import com.medplus.Medicine;

public class BuyMedicineCommand implements CommandAPI{
    private static BuyMedicineCommand instance;
    private Medicine medicine;

    public BuyMedicineCommand() {
        super();
    }
    public static synchronized BuyMedicineCommand getInstance(){
        if(instance==null){
            instance= new BuyMedicineCommand();
        }
        return instance;
    }

    @Override
    public String execute() {
        return medicine.buyMedicine();

    }
    public Medicine getMedicine(){
        return medicine;
    }
    public BuyMedicineCommand setMedicine(Medicine medicine){
        this.medicine=medicine;
        return this;
    }

}
