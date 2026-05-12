package br.com.mfmoura.fundamentals.conditionals;

import java.util.Locale;
import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salary, tax = 0.0;

        salary = sc.nextDouble();

        if (salary <= 0) {
            System.out.println("Inválido");
        } else if (salary <= 2000.0) {
            System.out.println("Isento");
        } else if (salary <= 3000.0) {
            tax = (salary - 2000.0) * 0.08;
        } else if (salary <= 4500.0) {
            tax = (1000.0 * 0.08) + ((salary - 3000.0) * 0.18);
        } else if (salary > 4500.0) {
            tax = (1000.0 * 0.08) + (1500.0 * 0.18) + ((salary - 4500.0) * 0.28);
        }

        if (tax > 0.0) {
            System.out.printf("Taxa: %.2f%n", tax);
        }

        sc.close();
    }
}
