package br.com.mfmoura.fundamentals.lists.todo.application;

import br.com.mfmoura.fundamentals.lists.todo.model.entities.Task;
import br.com.mfmoura.fundamentals.lists.todo.model.entities.TaskManager;
import br.com.mfmoura.fundamentals.lists.todo.model.enums.Status;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        TaskManager manager = new TaskManager();

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println();
                System.out.println("--- MENU ---");
                System.out.println("1 - Create a new task");

                if (!manager.getTasks().isEmpty()) {
                    System.out.println("2- View tasks");
                }

                System.out.println("0 - Exit");

                int option = sc.nextInt();

                System.out.println();
                switch (option) {
                    case 1:
                        System.out.print("Title: ");
                        sc.nextLine();
                        String title = sc.nextLine();
                        System.out.print("Bio: ");
                        String bio = sc.nextLine();
                        System.out.print("Status (TODO, DOING, DONE): ");
                        Status status = Status.valueOf(sc.nextLine().trim().toUpperCase());

                        Task task = new Task(title, bio, status);

                        manager.addTask(task);
                        break;
                    case 2:
                        System.out.println("Choose a way to read:");
                        System.out.println("1 - Overview");
                        System.out.println("2 - Filter by status");

                        int choice = sc.nextInt();

                        System.out.println();
                        switch (choice) {
                            case 1 -> {
                                for (Task t : manager.getTasks()){
                                    System.out.println(t);
                                }
                            }
                            case 2 -> {
                                System.out.print("Choose a status (TODO, DOING, DONE): ");
                                sc.nextLine();
                                Status statusOption = Status.valueOf(sc.nextLine().trim().toUpperCase());
                                for (Task t : manager.getTasksByStatus(statusOption)) {
                                    System.out.println(t);
                                }
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        return;
                    case 4:
                        System.out.println("Invalid option!");
                        break;
                }
            }
        }
    }
}
