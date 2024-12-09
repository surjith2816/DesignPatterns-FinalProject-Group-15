package com.medplus.Facade;

import com.medplus.Builder.MedicineBuilder;
import com.medplus.Builder.PharmacistBuilder;
import com.medplus.Medicine;
import com.medplus.Person;
import com.medplus.Pharmacist;
import com.medplus.Pharmacy;

public class PharmacyFacade {
    public Pharmacy pharmacy;
    public PharmacyFacade(String name) {
        pharmacy = new Pharmacy(name);
    }
    public void addMedicine(MedicineBuilder medicineBuilder) {
        Medicine medicine = new Medicine(medicineBuilder);
//        MedicineDecorator medicneDecoratorBook = new GiftcardDecorator(medicine);
//        System.out.println(medicneDecoratorBook);
        pharmacy.itemList.add(medicine);
        System.out.println("List of medicines in the item list");
        for(Medicine medicine1: pharmacy.itemList){
            System.out.println("ID: "+ medicine1.medicineId+" Name: "+medicine1.medicineName);
        }
    }

    public void addPharmacist(PharmacistBuilder pharmacistBuilder) {
        Person person = new Pharmacist(pharmacistBuilder);
        pharmacy.personList.add(person);
        System.out.println("List of people in the employee list");
        for(Person person1: pharmacy.personList){
            System.out.println("ID: "+ person1.getId()+" Name: "+person1.getFirstName());
        }
    }
    public void sortMedicines(Pharmacy pharmacy) {
        pharmacy.sortMedicines();
    }

    public void sortEmployees() {
        pharmacy.sortEmployees();
    }
}
