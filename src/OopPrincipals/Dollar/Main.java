package OopPrincipals.Dollar;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter dollar price: ");
            double price = sc.nextDouble();
            System.out.print("Enter how many dollars will be bought: ");
            double amount = sc.nextDouble();

            double result = CurrencyConverter.convert(price, amount);
            System.out.printf("Amount to be paid in Brazilian Real = R$%.2f%n", result);

        }
    }
}