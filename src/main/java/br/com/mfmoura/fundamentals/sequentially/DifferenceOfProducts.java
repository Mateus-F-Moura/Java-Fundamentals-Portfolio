package br.com.mfmoura.fundamentals.sequentially;

import java.util.Scanner;

public class DifferenceOfProducts {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c, d, ab, cd, result;

        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        c = sc.nextInt();
        System.out.print("Digite o quarto número: ");
        d = sc.nextInt();

        ab = a * b;
        cd = c * d;
        result = ab - cd;

        System.out.println("Diferença: " + result);

        sc.close();
    }
}
