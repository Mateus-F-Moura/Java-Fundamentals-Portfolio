package br.com.mfmoura.fundamentals.sequentially;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2, soma;

        System.out.print("Escreva o primeiro número: ");
        n1 = sc.nextInt();
        System.out.print("Escreva o segundo número: ");
        n2 = sc.nextInt();

        soma = n1 + n2;

        System.out.println("Soma: " + soma);

        sc.close();
    }
}
