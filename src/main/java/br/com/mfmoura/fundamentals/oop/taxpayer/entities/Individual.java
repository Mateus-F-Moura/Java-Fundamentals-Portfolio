package br.com.mfmoura.fundamentals.oop.taxpayer.entities;

public class Individual extends Payer{
    private Double healthExpenditures;

    public Individual(String name, Double income, Double healthExpenditures) {
        super(name, income);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
    
    @Override
    public double tax() {
        double basicTax = (getIncome() < 20000.00) ? 0.15 : 0.25;

        if (healthExpenditures == null || healthExpenditures == 0.0) {
            return getIncome() * basicTax;
        } else {
            return (getIncome() * basicTax) - (healthExpenditures * 0.50);
        }
    }
}
