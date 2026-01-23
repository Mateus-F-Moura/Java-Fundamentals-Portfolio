package Interfaces.Default.services;

public class BrazilInterestService implements InterestService{
    private Double interestRate;

    public BrazilInterestService(Double interestRate) {
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
