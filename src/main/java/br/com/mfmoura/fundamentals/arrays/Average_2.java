package br.com.mfmoura.fundamentals.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Average_2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the number of values you wanna type: ");
            int n = sc.nextInt();

            double[] values = new double[n];

            System.out.println();
            double sum = 0.0;
            for (int i = 0; i < values.length; i++) {
                System.out.print("Enter a value: ");
                values[i] = sc.nextDouble();

                sum += values[i];
            }

            double average = sum / values.length;

            System.out.println();
            System.out.print("Values = ");

            for (double value : values) {
                System.out.printf("%.2f  ", value);
            }

            System.out.printf("%nSum = %.2f%n", sum);
            System.out.printf("Average = %.2f", average);

        }
    }
}
