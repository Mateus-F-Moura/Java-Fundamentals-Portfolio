package br.com.mfmoura.fundamentals.loops;

import java.util.Scanner;

public class ForSquareAndCube {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        double quadrado, cubo;

        x = sc.nextInt();

        for (double i = 1; i <= x; i++) {
            quadrado = Math.pow(i, 2.0);
            cubo = Math.pow(i, 3.0);

            System.out.printf("%.0f %.0f %.0f%n", i, quadrado, cubo);
        }

        sc.close();
    }

}
