package br.com.mfmoura.fundamentals.oop.commonimportedusedproducts.application;

import br.com.mfmoura.fundamentals.oop.commonimportedusedproducts.entities.ImportedProduct;
import br.com.mfmoura.fundamentals.oop.commonimportedusedproducts.entities.Product;
import br.com.mfmoura.fundamentals.oop.commonimportedusedproducts.entities.UsedProduct;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of products: ");
            int n = sc.nextInt();

            List<Product> products = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                System.out.println();
                System.out.println("Product #" + (i + 1) + " data:");

                System.out.print("Common, used or imported (c/u/i)? ");
                char typeOption = sc.next().charAt(0);

                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.print("Price: ");
                double price = sc.nextDouble();

                Product product = switch (typeOption) {
                    case 'c' -> new Product(name, price);
                    case 'u' -> {
                        System.out.print("Manufacture date (DD/MM/YYYY): ");
                        sc.nextLine();
                        LocalDate date = LocalDate.parse(sc.nextLine(), UsedProduct.formatter);

                        yield new UsedProduct(name, price, date);
                    }
                    case 'i' -> {
                        System.out.print("Custom fee: ");
                        double customFee = sc.nextDouble();

                        yield new ImportedProduct(name, price, customFee);
                    }
                    default -> throw new IllegalStateException("Unexpected value: " + typeOption);
                };

                products.add(product);
            }

            System.out.println();
            System.out.println("Price Tags: ");
            for (Product p : products) {
                System.out.println(p.priceTag());
            }
        }
    }
}
