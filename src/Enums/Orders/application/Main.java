package Enums.Orders.application;

import Enums.Orders.entities.Order;
import Enums.Orders.entities.enums.OrderStatus;

import java.time.Instant;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Defina status do pedido: ");
            String status = sc.nextLine();

            Order order = new Order(102, Instant.now(), OrderStatus.valueOf(status));

            System.out.println(order);
        }
    }
}
