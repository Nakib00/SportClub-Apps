package users;

import interfaces.Taxable;

public class Employee extends Person implements Taxable{
    private int id; private float salary;
    public void showEmployeeInfo(){
        //
    }
    @Override
    public float calculateAndGetTaxPayable(){
        float taxPayable=0f;
        //taxPayable = .... use maxTaxRateForPersonalIncomeTax
        return taxPayable;
    }
}
