package OopPrincipals.Stock_2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("-- Enter product data --");
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();

            Product prod = new Product(name, price, quantity);

            System.out.println();
            System.out.println(prod);

            System.out.println("Enter the number of products to be added in stock: ");
            quantity = sc.nextInt();
            prod.addProduct(quantity);

            System.out.println();
            System.out.println(prod);

            System.out.println("Enter the number of products to be removed from stock: ");
            quantity = sc.nextInt();
            prod.removeProduct(quantity);

            System.out.println();
            System.out.println(prod);

        }
    }
}