package Inheritance_polymorphism.Entities;

public class IndividualPayer extends TaxPayer {
    private Double healthExpenditures;

    public IndividualPayer() {
        super();
    }

    public IndividualPayer(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double taxCalc() {
        if ((super.getAnualIncome() < 20000) && (getHealthExpenditures() == 0)) {
            return super.getAnualIncome() * 0.15;
        } else if ((super.getAnualIncome() < 20000) && (getHealthExpenditures() > 0)) {
            return (super.getAnualIncome() * 0.15) - (getHealthExpenditures() * 0.5);
        } else if ((super.getAnualIncome() > 20000) && (getHealthExpenditures() == 0)) {
            return super.getAnualIncome() * 0.25;
        } else if ((super.getAnualIncome() > 20000) && (getHealthExpenditures() > 0)) {
            return (super.getAnualIncome() * 0.25) - (getHealthExpenditures() * 0.5);
        }
        return null;
    }
}
