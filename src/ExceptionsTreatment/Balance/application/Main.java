package ExceptionsTreatment.Balance.application;

import ExceptionsTreatment.Balance.model.entities.Account;
import ExceptionsTreatment.Balance.model.exceptions.DomainException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter account data");

            System.out.print("Number: ");
            int number = sc.nextInt();

            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);

            System.out.println();
            System.out.println(account);
        } catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid type: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }
    }
}
