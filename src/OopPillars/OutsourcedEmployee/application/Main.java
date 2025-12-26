package OopPillars.OutsourcedEmployee.application;

import OopPillars.OutsourcedEmployee.entities.Employee;
import OopPillars.OutsourcedEmployee.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of employees: ");
            int n = sc.nextInt();

            List<Employee> employees = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                System.out.println();
                System.out.println("Employee #" + (i + 1) + " data: ");

                System.out.print("Outsourced (y/n)? ");
                char typeOption = sc.next().charAt(0);

                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.print("Hours: ");
                int hour = sc.nextInt();

                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();

                Employee employee = switch (typeOption) {
                    case 'y' -> {
                        System.out.print("Additional charge: ");
                        double additionalCharge = sc.nextDouble();

                        yield new OutsourcedEmployee(name, hour, valuePerHour, additionalCharge);
                    }
                    case 'n' -> new Employee(name, hour, valuePerHour);
                    default -> throw new IllegalStateException("Unexpected value: " + typeOption);
                };

                employees.add(employee);
            }

            System.out.println();
            System.out.println("Payments: ");
            for (Employee e : employees) {
                System.out.println(e);
            }
        }
    }
}
