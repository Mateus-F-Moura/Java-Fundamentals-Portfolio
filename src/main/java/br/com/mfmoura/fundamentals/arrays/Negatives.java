package br.com.mfmoura.fundamentals.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Negatives {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            int n;
            do {
                System.out.print("Enter de how many numbers input: ");
                n = sc.nextInt();

                if (n < 0 || n > 10){
                    System.out.println("Invalid! Need to be between 0 and 10.");
                }
            } while (n < 0 || n > 10);

            int[] numbers = new int[n];

            System.out.println();
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter a number: ");
                numbers[i] = sc.nextInt();
            }

            System.out.println();
            System.out.println("Negative numbers:");
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < 0) {
                    System.out.println(numbers[i]);
                }
            }

        }
    }
}
