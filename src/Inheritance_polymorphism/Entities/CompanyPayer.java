package Inheritance_polymorphism.Entities;

import javax.naming.InterruptedNamingException;

public class CompanyPayer extends TaxPayer {
    private Integer numberOfEmployee;

    public CompanyPayer() {
        super();
    }

    public CompanyPayer(String name, Double anualIncome, Integer numberOfEmployee) {
        super(name, anualIncome);
        this.numberOfEmployee = numberOfEmployee;
    }

    public Integer getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(Integer numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    @Override
    public Double taxCalc() {
        if (getNumberOfEmployee() > 10) {
            return super.getAnualIncome() * 0.14;
        } else {
            return super.getAnualIncome() * 0.16;
        }
    }


}
