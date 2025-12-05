package Loops;

import java.util.Locale;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            double[] grades = new double[2];

            int resposta;
            do {
                double sum = 0.0;

                for (int i = 0; i < grades.length; i++) {
                    grades[i] = validGrade(sc.nextDouble());
                    sum += grades[i];
                }

                double media = sum / grades.length;
                System.out.printf("media = %.2f%n", media);

                do {

                    System.out.println("novo calculo (1-sim 2-nao)");
                    resposta = sc.nextInt();

                } while (resposta < 1 || resposta > 2);

            } while (resposta == 1);

        }
    }

    public static double validGrade (double grade) {
        while (true) {
            if (grade >= 0.0 && grade <= 10.0) {
                break;
            } else {
                System.out.println("nota invalida");
            }
        }
        return grade;
    }
}
