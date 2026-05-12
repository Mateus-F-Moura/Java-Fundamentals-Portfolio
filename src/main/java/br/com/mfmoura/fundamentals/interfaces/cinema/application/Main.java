package br.com.mfmoura.fundamentals.interfaces.cinema.application;

import br.com.mfmoura.fundamentals.interfaces.cinema.model.entities.Entrance;
import br.com.mfmoura.fundamentals.interfaces.cinema.model.entities.Order;
import br.com.mfmoura.fundamentals.interfaces.cinema.model.entities.Session;
import br.com.mfmoura.fundamentals.interfaces.cinema.model.enums.DubbingType;
import br.com.mfmoura.fundamentals.interfaces.cinema.model.enums.EntranceType;
import br.com.mfmoura.fundamentals.interfaces.cinema.model.services.DiscountStrategy;
import br.com.mfmoura.fundamentals.interfaces.cinema.model.services.FamilyDiscount;
import br.com.mfmoura.fundamentals.interfaces.cinema.model.services.HalfDiscount;
import br.com.mfmoura.fundamentals.interfaces.cinema.model.services.OrderService;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<DiscountStrategy> currentDiscounts = List.of(
                new HalfDiscount(),
                new FamilyDiscount());
        OrderService orderService = new OrderService(currentDiscounts);
        Order order = new Order();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Movie Name: ");
            String name = sc.nextLine();
            System.out.print("Base Price: ");
            double price = sc.nextDouble();
            System.out.print("Type (DUBBED/SUBTITLED): ");
            DubbingType dubbing = DubbingType.valueOf(sc.next().toUpperCase());

            Session session = new Session(name, price, dubbing);

            System.out.print("How many tickets? ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("Ticket #" + (i + 1) + " type (FULL/HALF): ");
                EntranceType type = EntranceType.valueOf(sc.next().toUpperCase());
                order.addEntrance(new Entrance(session, type));
            }

            System.out.println();
            System.out.print(order);

            double total = orderService.calculateTotal(order);
            System.out.printf("TOTAL VALUE: $ %.2f%n", total);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: Invalid entrance type or dubbing type.");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
