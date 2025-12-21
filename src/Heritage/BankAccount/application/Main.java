package Heritage.BankAccount.application;

import Heritage.BankAccount.entities.Account;
import Heritage.BankAccount.entities.BusinessAccount;

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

            System.out.print("Is it a business account? (y/n): ");
            char type = sc.next().toLowerCase().charAt(0);

            Account account;
            if (type == 'y') {
                System.out.print("Loan limit: ");
                double loanLimit = sc.nextDouble();
                account = new BusinessAccount(number, holder, loanLimit);
            } else {
                account = new Account(number, holder);
            }

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
