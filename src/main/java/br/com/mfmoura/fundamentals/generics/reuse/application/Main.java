package br.com.mfmoura.fundamentals.generics.reuse.application;

import br.com.mfmoura.fundamentals.generics.reuse.services.PrintService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintService<String> printService = new PrintService<>();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the quantity of value to add: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            System.out.println();
            for (int i = 0; i < quantity; i++) {
                System.out.print("Enter a value: ");
                String value = sc.nextLine();

                printService.addValue(value);
            }

            System.out.println();
            System.out.println("Result:");
            System.out.println(printService);

            System.out.print("First string: ");
            System.out.println(printService.getFirst());
        }
    }
}
