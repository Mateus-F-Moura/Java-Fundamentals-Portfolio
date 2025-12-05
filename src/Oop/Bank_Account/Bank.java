package Oop.Bank_Account;

public class Bank {

    private final int number;
    private String holder;
    private double balance;

    public Bank(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Bank(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
    }

    public void withdraw(double withdraw) {
        this.balance -= (withdraw + 5.00);
    }

    @Override
    public String toString() {
        return "Account: " + getNumber() +
                ", Holder: " + getHolder() +
                ", Balance: " + String.format("%.2f", balance);
    }
}
