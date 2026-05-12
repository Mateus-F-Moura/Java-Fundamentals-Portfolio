package br.com.mfmoura.fundamentals.conditionals;

import java.util.Scanner;

public class NegativeOrPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter number: ");
        n = sc.nextInt();

        if (n < 0) {
            System.out.println("This number is negative");
        } else if (n > 0) {
            System.out.println("This number is positive");
        } else {
            System.out.println("This number is zero");
        }

        sc.close();
    }
}