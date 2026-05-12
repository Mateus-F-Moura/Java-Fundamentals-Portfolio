package br.com.mfmoura.fundamentals.conditionals;

import java.util.Scanner;

public class MultiplesCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("Enter first number: ");
        n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        n2 = sc.nextInt();

        if (n1 > n2) {
            if (n1 % n2 == 0) {
                System.out.println("Multiplos");
            } else {
                System.out.println("Não Multiplos");
            }
        } else {
            if (n2 % n1 == 0) {
                System.out.println("Multiplos");
            } else {
                System.out.println("Não Multiplos");
            }
        }

        sc.close();
    }
}
