package br.com.mfmoura.fundamentals.arrays;

import java.util.Scanner;
public class ArrayAverage {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.print("Digite o número de notas: ");
        x = sc.nextInt();

        double[] notas = new double[x];
        double soma = 0, media;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota: ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        media = soma / notas.length;

        System.out.println("Media: " + media);

        sc.close();
    }
}