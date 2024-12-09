
package com.medplus.Factory;

        import com.medplus.Builder.BuilderAPI;
        import com.medplus.Builder.MedicineBuilder;
        import com.medplus.Medicine;

public class MedicineFactory extends AbstractFactory {
    private static MedicineFactory instance;
    private  MedicineFactory() {
        super();
        instance=null;
    }
    public static synchronized MedicineFactory getInstance() {
        if (instance == null) {
            instance = new MedicineFactory();
        }
        return instance;
    }
    @Override
    public Medicine getObject(BuilderAPI buildObject) {
        MedicineBuilder medicineBuilder=(MedicineBuilder)buildObject;
        return new Medicine(medicineBuilder);
    }
}
