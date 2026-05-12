package br.com.mfmoura.fundamentals.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Above_average {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter how many elements on vector: ");
            int n = sc.nextInt();
            
            double[] numbers = new double[n];

            double sum = 0.0;
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = sc.nextDouble();

                sum += numbers[i];
            }

            double average = sum / numbers.length;

            System.out.println("Average = " + average);

            System.out.println("Elements above average: ");
            for (double number : numbers) {
                if (number < average) {
                    System.out.println(number);
                }
            }
            
        }
    }
}
