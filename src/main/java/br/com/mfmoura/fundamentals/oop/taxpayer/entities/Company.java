package br.com.mfmoura.fundamentals.oop.taxpayer.entities;

public class Company extends Payer{
    public Integer numberOfEmployee;

    public Company(String name, Double income, Integer numberOfEmployee) {
        super(name, income);
        this.numberOfEmployee = numberOfEmployee;
    }

    public Integer getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(Integer numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    @Override
    public double tax() {
        return (numberOfEmployee < 10) ? getIncome() * 0.16 : getIncome() * 0.14;
    }
}
