package Lists.Employee.application;

import Lists.Employee.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            List<Employee> employees = new ArrayList<>();

            System.out.print("Number of employees to insert: ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println();
                System.out.println("#" + (i + 1) + " Employee:");

                System.out.print("ID: ");
                int id = sc.nextInt();

                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.print("Salary: ");
                double salary = sc.nextDouble();

                Employee employee = new Employee(id, name, salary);
                employees.add(employee);
            }

            System.out.println();
            System.out.println("Employees:");
            showEmployees(employees);

            System.out.println();
            System.out.print("Search by id: ");
            int idSearch = sc.nextInt();

            Employee position = employees.stream().filter(employee -> employee.getId() == idSearch).findFirst().orElse(null);

            if (position == null) {
                System.out.println("No id founded");
            } else {
                System.out.print("Percentage to increase: ");
                int percentage = sc.nextInt();
                position.increaseSalary(percentage);
            }

            System.out.println();
            System.out.println("Employees:");
            showEmployees(employees);
        }
    }

    public static void showEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}