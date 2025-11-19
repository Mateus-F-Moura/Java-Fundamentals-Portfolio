package Arrays.Product.application;

import Arrays.Product.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();

            Product[] vector = new Product[n];

            for (int i = 0; i < vector.length; i++) {
                sc.nextLine();

                String name = sc.nextLine();
                int quantity = sc.nextInt();
                double price = sc.nextDouble();

                vector[i] = new Product(name, quantity, price);
            }

            double sum = 0.0;
            for (int i = 0; i < vector.length; i++) {
                sum += vector[i].getPrice();
            }

            double average = sum / vector.length;

            System.out.println("Average: " + average);

        }
    }

}
