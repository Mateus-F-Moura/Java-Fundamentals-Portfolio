package Java_Completo.Oop.Bank_Account.entities;

public class Bank {

    private final int number;
    private String name;
    private double balance;

    public Bank(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void deposit(double deposit) {
        this.balance += deposit;
    }

    public void withdraw(double withdraw) {
        this.balance -= (withdraw + 5.00);
    }

    @Override
    public String toString() {
        return "Account data: \n" +
                "Account: " + getNumber() +
                ", Holder: " + getName() +
                ", Balance: " + String.format("%.2f", balance);
    }
}
