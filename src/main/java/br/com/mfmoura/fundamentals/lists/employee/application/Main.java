package br.com.mfmoura.fundamentals.lists.employee.application;

import br.com.mfmoura.fundamentals.lists.employee.entities.Employee;

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

                boolean idExists = employees.stream().anyMatch(e -> e.getId() == id);
                if (idExists) {
                    System.out.println("Error: Employee with ID " + id + " already exists!");
                    i--;
                    continue;
                }

                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.print("Sector: ");
                String sector = sc.nextLine();

                System.out.print("Salary: ");
                double salary = sc.nextDouble();

                Employee employee = new Employee(id, name, salary, sector);
                employees.add(employee);
            }

            System.out.println();
            System.out.println("Employees:");
            showEmployees(employees);

            System.out.println();
            System.out.println("You wanna increase salary by employee or by sector? (1-Employee/2-Sector)");
            int choose = sc.nextInt();

            switch (choose) {
                case 1:
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
                    break;
                case 2:
                    System.out.println();
                    sc.nextLine();
                    System.out.print("Search by sector: ");
                    String sectorSearch = sc.nextLine();

                    List<Employee> positions = employees.stream().filter(employee -> employee.getSector().equalsIgnoreCase(sectorSearch)).toList();

                    System.out.print("Percentage to increase: ");
                    int percentage = sc.nextInt();

                    for (Employee employee : positions) {
                        employee.increaseSalary(percentage);
                    }
                    break;
                default:
                    System.out.println("Not a valid answer");
                    break;
            }



            System.out.println();
            System.out.println("Final list of employees:");
            showEmployees(employees);
        }
    }

    public static void showEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}