package br.com.mfmoura.fundamentals.loops;

import java.util.Scanner;

public class WhileQuadrant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y;

        while (true) {
            System.out.print("Digite cordenada x: ");
            x = sc.nextDouble();
            System.out.print("Digite cordenada y: ");
            y = sc.nextDouble();
            if (x == 0 || y == 0) {
                break;
            } else if (x > 0 && y > 0) {
                System.out.println("Superior Direito");
            } else if (x < 0 && y > 0) {
                System.out.println("Superior Esquerdo");
            } else if (x > 0 && y < 0) {
                System.out.println("Inferior Direito");
            } else if (x < 0 && y < 0) {
                System.out.println("Inferior Esquerdo");
            }
        }

        sc.close();
    }
}
