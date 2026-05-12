package br.com.mfmoura.fundamentals.loops;

import java.util.Scanner;

public class ForDivision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n, dividendo, divisor, quociente = 0.0;

        n = sc.nextDouble();

        for(int i = 0; i < n; i++) {
            do {
                dividendo = sc.nextDouble();
                divisor = sc.nextDouble();
            } while (divisor == 0);

            quociente = dividendo / divisor;
            System.out.println(quociente);
        }

        sc.close();
    }

}
