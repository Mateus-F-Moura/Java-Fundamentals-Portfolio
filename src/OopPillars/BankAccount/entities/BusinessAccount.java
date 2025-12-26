package OopPillars.BankAccount.entities;

public class BusinessAccount extends Account{
    private Double loanLimit;

    public BusinessAccount(Integer number, String holder, Double loanLimit) {
        super(number, holder);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void withdraw(Double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }

    public void loan(Double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.00;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLoan Limit: " + String.format("%.2f", loanLimit);
    }
}
