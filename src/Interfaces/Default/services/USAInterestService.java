package Interfaces.Default.services;

public class USAInterestService implements InterestService{
    private Double interestRate;

    public USAInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double tax(double amount, int months) {
        return InterestService.super.tax(amount, months);
    }
}
