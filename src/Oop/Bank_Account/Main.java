package Oop.Bank_Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try(Scanner sc = new Scanner(System.in)) {

            System.out.println();
            System.out.println("---Create a Bank Account---");

            System.out.println();
            System.out.print("Create a account number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter a name for your account: ");
            String holder = sc.nextLine();

            System.out.println();
            System.out.print("Wanna make a initial deposit? (1 - Yes / 2 - Skip): ");
            int option = sc.nextInt();

            double initialDeposit = 0;
            if (option == 1) {
                System.out.print("Enter initial deposit: ");
                initialDeposit = sc.nextDouble();
            }

            Bank account = new Bank(number, holder, initialDeposit);
            System.out.println();
            System.out.println("---Account data---\n" + account);

            do {
                System.out.println();
                System.out.println("1 - Change Name \n2 - Deposit \n3 - Withdrawn \n0 - Exit");

                System.out.println();
                System.out.print("Enter a option: ");
                option = sc.nextInt();
                sc.nextLine();

                switch (option) {
                    case 0:
                        System.out.println("Thanks for using our bank!");
                        break;
                    case 1:
                        System.out.print("Enter name: ");
                        holder = sc.nextLine();
                        account.setHolder(holder);
                        break;
                    case 2:
                        System.out.print("Enter how much to deposit: ");
                        initialDeposit = sc.nextDouble();
                        account.deposit(initialDeposit);
                        break;
                    case 3:
                        System.out.print("Enter how much to withdrawn ($ 5.00 taxes): ");
                        initialDeposit = sc.nextDouble();
                        account.withdraw(initialDeposit);
                        break;
                    default:
                        System.out.println();
                        System.out.println("Invalid answer");
                        break;
                }

                System.out.println();
                System.out.println("---Account data update---\n" + account);
            } while (option != 0);

        }

    }
}