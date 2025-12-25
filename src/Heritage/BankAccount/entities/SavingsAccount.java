package Heritage.BankAccount.entities;

public class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount(Integer number, String holder, Double interestRate) {
        super(number, holder);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(Double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }
}
