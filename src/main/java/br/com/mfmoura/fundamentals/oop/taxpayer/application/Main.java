package br.com.mfmoura.fundamentals.oop.taxpayer.application;

import br.com.mfmoura.fundamentals.oop.taxpayer.entities.Company;
import br.com.mfmoura.fundamentals.oop.taxpayer.entities.Individual;
import br.com.mfmoura.fundamentals.oop.taxpayer.entities.Payer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of tax payers: ");
            int n = sc.nextInt();

            List<Payer> payers = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                System.out.println();
                System.out.println("#" + (i+1) + " Taxpayer data:");

                System.out.print("Individual or company (i/c)? ");
                char typeOption = sc.next().charAt(0);

                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.print("Anual income: ");
                double income = sc.nextDouble();

                Payer payer = switch (typeOption) {
                    case 'i' -> {
                        System.out.print("Health expenditures: ");
                        double healthExpenditures = sc.nextDouble();

                        yield new Individual(name, income, healthExpenditures);
                    }
                    case 'c' -> {
                        System.out.print("Number of employees: ");
                        int numberOfEmployee = sc.nextInt();

                        yield new Company(name, income, numberOfEmployee);
                    }
                    default -> throw new IllegalStateException("Unexpected value: " + typeOption);
                };

                payers.add(payer);
            }

            double totalTax = 0.0;

            System.out.println();
            System.out.println("Taxes paid:");
            for (Payer p : payers) {
                System.out.printf("%s: $ %.2f%n", p.getName(), p.tax());

                totalTax += p.tax();
            }

            System.out.println();
            System.out.printf("Total taxes: $ %.2f%n", totalTax);
        }
    }
}
