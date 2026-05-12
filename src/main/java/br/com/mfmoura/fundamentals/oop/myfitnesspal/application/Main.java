package br.com.mfmoura.fundamentals.oop.myfitnesspal.application;

import br.com.mfmoura.fundamentals.oop.myfitnesspal.model.entities.DailyLog;
import br.com.mfmoura.fundamentals.oop.myfitnesspal.model.entities.Food;
import br.com.mfmoura.fundamentals.oop.myfitnesspal.model.entities.User;
import br.com.mfmoura.fundamentals.oop.myfitnesspal.model.enums.Activity;
import br.com.mfmoura.fundamentals.oop.myfitnesspal.model.enums.Gender;
import br.com.mfmoura.fundamentals.oop.myfitnesspal.model.enums.Goal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=== MyFitnessPal Simple Clone ===");

            User user = createUser(sc);
            DailyLog dailyLog = new DailyLog();

            System.out.println();
            System.out.println(user);

            int option;

            do {
                showMenu();
                option = sc.nextInt();
                sc.nextLine();

                switch (option) {
                    case 1 -> addFood(sc, dailyLog);
                    case 2 -> System.out.println(dailyLog);
                    case 3 -> showDailySummary(user, dailyLog);
                    case 4 -> System.out.println(user);
                    case 0 -> System.out.println("Closing application...");
                    default -> System.out.println("Invalid option.");
                }

            } while (option != 0);
        }
    }

    private static User createUser(Scanner sc) {
        System.out.println();
        System.out.println("Create your profile");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Gender ");
        showEnumOptions(Gender.values());
        Gender gender = Gender.valueOf(sc.nextLine().toUpperCase());

        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.print("Weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Height in cm: ");
        double height = sc.nextDouble();
        sc.nextLine();

        System.out.print("Activity level ");
        showEnumOptions(Activity.values());
        Activity activity = Activity.valueOf(sc.nextLine().toUpperCase());

        System.out.print("Goal ");
        showEnumOptions(Goal.values());
        Goal goal = Goal.valueOf(sc.nextLine().toUpperCase());

        return new User(name, gender, age, weight, height, activity, goal);
    }

    private static void showMenu() {
        System.out.println();
        System.out.println("=== Menu ===");
        System.out.println("1 - Add food");
        System.out.println("2 - Show daily log");
        System.out.println("3 - Show daily summary");
        System.out.println("4 - Show user profile");
        System.out.println("0 - Exit");
        System.out.print("Choose an option: ");
    }

    private static void addFood(Scanner sc, DailyLog dailyLog) {
        System.out.println();
        System.out.println("Add food");

        System.out.print("Food name: ");
        String name = sc.nextLine();

        System.out.print("Calories: ");
        double calories = sc.nextDouble();

        System.out.print("Protein in grams: ");
        double protein = sc.nextDouble();
        sc.nextLine();

        Food food = new Food(name, calories, protein);
        dailyLog.addFood(food);

        System.out.println("Food added successfully.");
    }

    private static void showDailySummary(User user, DailyLog dailyLog) {
        System.out.println();
        System.out.println("=== Daily Summary ===");
        System.out.printf("Calories goal: %.2f kcal%n", user.dailyCaloriesGoal());
        System.out.printf("Calories consumed: %.2f kcal%n", dailyLog.totalConsumedCalories());
        System.out.printf("Calories remaining: %.2f kcal%n", dailyLog.remainingCalories(user));

        System.out.println();

        System.out.printf("Protein goal: %.2fg%n", user.dailyProteinGoal());
        System.out.printf("Protein consumed: %.2fg%n", dailyLog.totalConsumedProtein());
        System.out.printf("Protein remaining: %.2fg%n", dailyLog.remainingProtein(user));
    }

    private static <T extends Enum<T>> void showEnumOptions(T[] values) {
        System.out.print("(");

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]);

            if (i < values.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.print("): ");
    }
}
