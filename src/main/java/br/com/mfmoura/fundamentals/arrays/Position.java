package br.com.mfmoura.fundamentals.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Position {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)){

            System.out.print("Enter how many values read: ");
            int n = sc.nextInt();
            System.out.println();

            double[] values = new double[n];

            for (int i = 0; i < values.length; i++) {
                System.out.print("Enter a value: ");
                values[i] = sc.nextDouble();
            }

            double biggest = values[0];
            int position = 0;

            for (int i = 0; i < values.length; i++) {
                if (values[i] >= biggest) {
                    biggest = values[i];
                    position = i;
                }
            }

            System.out.println();
            System.out.println("Biggest = " + biggest);
            System.out.println("Position = " + position);

        }
    }
}
