package Oop.RandomUser.application;

import Oop.RandomUser.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)){

            List<User> users = new ArrayList<>();
            
            int choose;
            do {
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Password: ");
                String password = sc.nextLine();
                
                User user = new User(name, password);
                
                users.add(user);

                System.out.println();
                System.out.println("----------------------------");
                System.out.println("1 - Create or 2 - Exit");

                do {
                    choose = sc.nextInt();
                } while (choose < 1 || choose > 2);

                sc.nextLine();
            } while (choose != 2);

            System.out.println();
            System.out.println("All users registered: ");

            for (User user : users) {
                System.out.println(user.getName());
            }

        } catch (Exception e) {
            throw new RuntimeException("Deu merda no " + e);
        }
    }
}
