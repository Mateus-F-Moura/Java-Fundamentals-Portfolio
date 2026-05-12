package br.com.mfmoura.fundamentals.arrays.boardinghouse;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            Resident[] resident = new Resident[10];

            System.out.print("How many rooms will be rented: ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                sc.nextLine();
                System.out.println();
                System.out.println("Rent #" + (i + 1) + ":");
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                int room;
                do {
                    System.out.print("Room: ");
                    room = sc.nextInt();
                    if (resident[room] != null) {
                        System.out.println("Room already occupied, try again");
                    }
                } while (resident[room] != null);

                resident[room] = new Resident(name, email, room);
            }

            System.out.println();
            System.out.println("Busy rooms:");
            for (Resident value : resident) {
                if (value != null) {
                    System.out.println(value.getRoom() + ": " + value.getName() + ", " + value.getEmail());
                }
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid!");
        }
    }
}
