package br.com.mfmoura.fundamentals.sequentially;

import java.util.Locale;
import java.util.Scanner;

public class TotalPartsPrice {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, qtd1, qtd2;
        double p1, p2, pTotal;

        System.out.print("Enter product ID : ");
        cod1 = sc.nextInt();
        System.out.print("Enter product quantity : ");
        qtd1 = sc.nextInt();
        System.out.print("Enter product price : ");
        p1 = sc.nextDouble();

        System.out.print("Enter product id : ");
        cod2 = sc.nextInt();
        System.out.print("Enter product quantity : ");
        qtd2 = sc.nextInt();
        System.out.print("Enter product price : ");
        p2 = sc.nextDouble();

        pTotal = (qtd1 * p1) + (qtd2 * p2);

        System.out.println("Products ID: " + cod1 + ", " + cod2 + ".");
        System.out.printf("Total Price: %.2f", pTotal);

        sc.close();
    }
}
