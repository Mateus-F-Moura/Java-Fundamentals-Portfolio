package Java_Completo.Oop.Bank_Account.application;

import Java_Completo.Oop.Bank_Account.entities.Bank;

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
            String name = sc.nextLine();

            Bank account = new Bank(number, name);

            System.out.println();
            System.out.print("Wanna make a initial deposit? (1 - Yes / 2 - Skip): ");
            int option = sc.nextInt();

            double value;
            if (option == 1) {
                System.out.print("Enter initial deposit: ");
                value = sc.nextDouble();
                account.deposit(value);
            }
            System.out.println(account);

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
                        name = sc.nextLine();
                        account.setName(name);
                        break;
                    case 2:
                        System.out.print("Enter how much to deposit: ");
                        value = sc.nextDouble();
                        account.deposit(value);
                        break;
                    case 3:
                        System.out.print("Enter how much to withdrawn ($ 5.00 taxes): ");
                        value = sc.nextDouble();
                        account.withdraw(value);
                        break;
                    default:
                        System.out.println();
                        System.out.println("Invalid answer");
                        break;
                }

                System.out.println(account);
            } while (option != 0);

        }

    }
}
