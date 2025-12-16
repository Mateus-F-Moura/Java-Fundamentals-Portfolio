package Enums.Workers.application;

import Enums.Workers.entities.Department;
import Enums.Workers.entities.HourContract;
import Enums.Workers.entities.Worker;
import Enums.Workers.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Level: ");
            String levelName = sc.nextLine();

            System.out.print("Base Salary: ");
            Double baseSalary = sc.nextDouble();

            System.out.print("Department: ");
            sc.nextLine();
            String departmentName = sc.nextLine();

            Worker worker = new Worker(name, WorkerLevel.valueOf(levelName), baseSalary, new Department(departmentName));

            System.out.print("Enter how many work contracts to this worker: ");
            int n = sc.nextInt();

            Boolean choise = false;
            for (int i = 0; i < n; i++) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                System.out.println("Enter contract #" + (i + 1) + " data:");

                System.out.print("Date (DD/MM/YYYY): ");
                sc.nextLine();
                LocalDate date = LocalDate.parse(sc.nextLine(), formatter);

                System.out.print("Value per hour: ");
                Double valuePerHour = sc.nextDouble();

                System.out.print("Hour(s): ");
                int hour = sc.nextInt();

                HourContract contract = new HourContract(date, valuePerHour, hour);

                worker.addContract(contract);
            }

            System.out.print("Enter month and year to calculate income (MM/YYYY): ");
            sc.nextLine();
            String monthAndYear = sc.next();

            int month = Integer.parseInt(monthAndYear.substring(0, 2));
            int year = Integer.parseInt(monthAndYear.substring(3));

            System.out.println("Name: " + worker);
            System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(worker.findContractByDate(month, year))));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
