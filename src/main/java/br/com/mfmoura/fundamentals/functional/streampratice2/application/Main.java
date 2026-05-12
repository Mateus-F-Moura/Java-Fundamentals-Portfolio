package br.com.mfmoura.fundamentals.functional.streampratice2.application;

import br.com.mfmoura.fundamentals.functional.streampratice2.entities.People;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter full file path: ");
            String path = sc.nextLine();

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            try (BufferedReader br = new BufferedReader(new FileReader(path))) {

                List<People> list = new ArrayList<>();

                String line = br.readLine();

                while (line != null) {
                    String[] fields = line.split(",");

                    list.add(new People(fields[0], fields[1], Double.parseDouble(fields[2])));

                    line = br.readLine();
                }

                List<String> emails = list.stream()
                        .filter(people -> people.getSalary() > salary)
                        .map(People::getEmail).toList();

                System.out.println();
                System.out.println("Email of people whose salary is more than " + salary + ":");
                emails.forEach(System.out::println);

                double sum = list.stream()
                        .filter(people -> people.getName().toUpperCase().charAt(0) == 'M')
                        .map(People::getSalary).reduce(0.0, Double::sum);

                System.out.println();
                System.out.printf("Sum of everyone with initial 'M': %.2f%n", sum);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
