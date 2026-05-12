package br.com.mfmoura.fundamentals.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Average_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try(Scanner sc = new Scanner(System.in)) {

            double[] values = new double[2];

            for(int i = 0; i < values.length; i++) {
                values[i] = sc.nextDouble();
            }

            double sum = 0.0;

            for (double value : values) {
                sum += value;
            }

            double media = sum / values.length;

            System.out.printf("MEDIA = %.5f", media);
        }
    }
}
