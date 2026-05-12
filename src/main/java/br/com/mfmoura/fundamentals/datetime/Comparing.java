package br.com.mfmoura.fundamentals.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Comparing {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.print("Enter date of birth (dd/MM/yyyy): ");
            LocalDate date1 = LocalDate.parse(sc.nextLine(), fmt1);
            System.out.print("Enter date of birth (dd/MM/yyyy): ");
            LocalDate date2 = LocalDate.parse(sc.nextLine(), fmt1);

            Period duration = Period.between(date1, date2);

            System.out.println("Difference: \n"
                    + "Years: " + Math.abs(duration.getYears())
                    + ", Months: " + Math.abs(duration.getMonths())
                    + ", Days: " + Math.abs(duration.getDays()));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
