package br.com.mfmoura.fundamentals.loops;

import java.util.Locale;
import java.util.Scanner;

public class ForWeightedAverage {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double x, y, z, media;

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            x = sc.nextDouble();
            y = sc.nextDouble();
            z = sc.nextDouble();
            media = ((x * 2.0) + (y * 3.0) + (z * 5.0)) / 10.0;
            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }

}
