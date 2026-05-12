package br.com.mfmoura.fundamentals.loops;

import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            double[] values = new double[3];

            for (int i = 0; i < values.length; i++) {
                values[i] = sc.nextDouble();
            }

            double delta = Math.pow(values[1], 2) - 4 * values[0] * values[2];

            if (values[0] == 0 || delta < 0) {
                System.out.println("Impossible calculation");
            } else {
                double x1 = (-values[1] + Math.sqrt(delta)) / (2 * values[0]);
                double x2 = (-values[1] - Math.sqrt(delta)) / (2 * values[0]);

                System.out.printf("R1 = %.5f%n", x1);
                System.out.printf("R2 = %.5f%n", x2);
            }

        }
    }
}