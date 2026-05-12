package br.com.mfmoura.fundamentals.arrays;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Average_3 {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            double[] notas = new double[4];
            for (int i = 0; i < notas.length; i++) {
                notas[i] = sc.nextDouble();
            }

            double media = ((notas[0] * 2.0) +
                    (notas[1] * 3.0) +
                    (notas[2] * 4.0) +
                    (notas[3])) / (2.0 + 3.0 + 4.0 + 1.0);
            System.out.printf("Media: %.1f%n", media);

            if (media > 7.0) {
                System.out.println("Aluno aprovado.");
            } else if (media < 5.0) {
                System.out.println("Aluno reprovado.");
            } else if (media >= 5.0 && media < 6.9) {
                System.out.println("Aluno em exame.");
                System.out.print("Nota do exame: ");
                double exame = sc.nextDouble();

                double mediaFinal = (media + exame) / 2;
                if (mediaFinal > 7.0) {
                    System.out.println("Aluno aprovado.");
                } else if (mediaFinal < 5.0) {
                    System.out.println("Aluno reprovado.");
                }

                System.out.printf("Media Final: %.1f%n", mediaFinal);
            }

        }

    }

}