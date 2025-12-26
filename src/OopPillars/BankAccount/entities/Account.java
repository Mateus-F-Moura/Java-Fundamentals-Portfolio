package OopPillars.BankAccount.entities;

public class Account {
    private Integer number;
    private String holder;
    protected Double balance = 0.0;

    public Account(Integer number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(Double amount) {
        if (amount <= balance) {
            balance -= amount + 5.0;
        }
    }

    public void deposit(Double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public String toString() {
        return "Number: " + number +
                "\nHolder: " + holder +
                "\nBalance: " + String.format("%.2f", balance);
    }
}
