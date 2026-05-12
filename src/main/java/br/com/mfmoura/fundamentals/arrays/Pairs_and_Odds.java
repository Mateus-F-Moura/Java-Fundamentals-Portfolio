package br.com.mfmoura.fundamentals.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Pairs_and_Odds {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Type how many numbers you want to enter: ");
            int n = sc.nextInt();
            System.out.println();
            
            int[] numbers = new int[n];

            int pairsCount = 0;
            int oddsCount = 0;
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter a number: ");
                numbers[i] = sc.nextInt();
                
                if (numbers[i] % 2 == 0) {
                    pairsCount += 1;
                } else if (numbers[i] % 2 != 0) {
                    oddsCount += 1;
                }
            }

            System.out.println();
            System.out.println("Pairs: ");
            for (int number : numbers) {
                if (number % 2 == 0) {
                    System.out.print(number + ", ");
                } else {
                    System.out.println("No pairs.");
                }
            }
            System.out.println();
            System.out.println("\nPairs count: " + pairsCount);

            System.out.println();
            System.out.println("Odds: ");
            for (int number : numbers) {
                if (number % 2 != 0) {
                    System.out.print(number + ", ");
                } else {
                    System.out.println("No odds.");
                }
            }
            System.out.println();
            System.out.println("\nOdds count: " + oddsCount);

        }
    }
}
