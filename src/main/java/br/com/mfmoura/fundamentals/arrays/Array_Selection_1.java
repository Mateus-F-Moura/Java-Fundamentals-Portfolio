package br.com.mfmoura.fundamentals.arrays;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Array_Selection_1 {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            double[] values = new double[100];

            for (int i = 0; i < values.length; i++) {
                values[i] = sc.nextDouble();
                if (values[i] <= 10) {
                    System.out.printf("A[%d] = %.1f%n", i, values[i]);
                }
            }

        }

    }
}
 