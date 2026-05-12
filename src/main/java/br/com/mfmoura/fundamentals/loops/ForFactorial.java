package br.com.mfmoura.fundamentals.loops;

import java.util.Scanner;

public class ForFactorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, fat = 1.0;

        x = sc.nextDouble();

        for (int i = 1; i <= x; i++) {
            fat *= i;
        }

        System.out.println(fat);

        sc.close();
    }

}
