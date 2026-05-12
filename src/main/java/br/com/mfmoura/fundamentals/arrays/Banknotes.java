package br.com.mfmoura.fundamentals.arrays;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Banknotes {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            int value;

            do {
                value = sc.nextInt();
            } while (value < 0 || value > 1000000);

            int[] notas = {100, 50, 20, 10, 5, 2, 1};

            System.out.println(value);

            for (int nota : notas) {
                int quantidade = value / nota;

                System.out.printf("%d nota(s) de R$ %.2f%n", quantidade, (double)nota);

                value %= nota;
            }

        }
    }
}