package OopPillars.BankAccount.application;

import OopPillars.BankAccount.entities.Account;
import OopPillars.BankAccount.entities.BusinessAccount;
import OopPillars.BankAccount.entities.SavingsAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("=====Account Data=====");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.println("Select account type:");
            System.out.println("1 - Business Account");
            System.out.println("2 - Savings Account");

            System.out.print("Option: ");
            int typeOption = sc.nextInt();

            Account account = switch (typeOption){
                case 2 -> {
                    System.out.print("Loan limit: ");
                    double loanLimit = sc.nextDouble();
                    yield new BusinessAccount(number, holder, loanLimit);
                }
                case 3 -> {
                    System.out.print("Interest rate: ");
                    double interestRate = sc.nextDouble();
                    yield new SavingsAccount(number, holder, interestRate);
                }
                default -> throw new IllegalStateException("Unexpected value: " + typeOption);
            };

            int option = -1;
            while (option != 0) {
                System.out.println("\n===== Menu =====");
                System.out.println("1-Deposit\n2-Withdraw");

                if (account instanceof BusinessAccount) {
                    System.out.println("3-Loan");
                }

                System.out.println("0-Exit");
                System.out.print("Option: ");
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.print("Amount to deposit: ");
                        account.deposit(sc.nextDouble());
                        break;
                    case 2:
                        System.out.print("Amount to withdraw: ");
                        account.withdraw(sc.nextDouble());
                        break;
                    case 3:
                        if (account instanceof BusinessAccount) {
                            System.out.print("Amount to loan: ");
                            double amount = sc.nextDouble();
                            ((BusinessAccount) account).loan(amount);
                        } else {
                            System.out.println("This option is only for Business Accounts!");
                        }
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Invalid option!");
                }

                System.out.println("\nYour Account Info:");
                System.out.println(account);
            }
        }
    }
}
