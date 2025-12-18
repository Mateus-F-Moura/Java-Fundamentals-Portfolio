package Compositions.Orders2.application;

import Compositions.Orders2.entities.Client;
import Compositions.Orders2.entities.Order;
import Compositions.Orders2.entities.OrderItem;
import Compositions.Orders2.entities.Product;
import Compositions.Orders2.entities.enums.OrderStatus;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static DateTimeFormatter instantFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
    public static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("-----Enter client data-----");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("E-mail: ");
            String email = sc.nextLine();

            System.out.print("Birth Date (dd/mm/yyyy): ");
            LocalDate birthDate = LocalDate.parse(sc.nextLine(), dateFormatter);

            Client client = new Client(name, email, birthDate);

            System.out.println();
            System.out.println("-----Enter order data-----");

            Instant instant = Instant.now();

            System.out.print("Status: ");
            OrderStatus status = OrderStatus.valueOf(sc.nextLine());

            Order order = new Order(instant, status, client);

            System.out.print("How many items to order? ");
            int n = sc.nextInt();

            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.println("-" + (i + 1) + "# Item data-");

                System.out.print("Product name: ");
                sc.nextLine();
                String prodName = sc.nextLine();

                System.out.print("Product price: ");
                double price = sc.nextDouble();

                System.out.print("Product quantity: ");
                int quantity = sc.nextInt();

                Product product = new Product(prodName, price);

                OrderItem orderItem = new OrderItem(quantity, product);

                order.addItem(orderItem);
            }

            System.out.println();
            System.out.println("-----ORDER SUMMARY-----");
            System.out.println(order);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
