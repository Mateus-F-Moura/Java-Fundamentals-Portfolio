package Arrays.People_Data.application;

import Arrays.People_Data.entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter how many people you wanna type: ");
            int n = sc.nextInt();

            People[] people = new People[n];

            int countF = 0;
            int countM = 0;

            double sumF = 0.0;
            double sumM = 0.0;

            for (int i = 0; i < people.length; i++) {
                System.out.println();
                System.out.print("Enter " + (i + 1) + "o person height: ");
                double height = sc.nextDouble();

                System.out.print("Enter " + (i + 1) + "o person gender: ");
                char gender = sc.next().charAt(0);

                people[i] = new People(height, gender);

                if (Character.toLowerCase(gender) == 'f') {
                    countF += 1;
                    sumF += height;
                } else if (Character.toLowerCase(gender) == 'm') {
                    countM += 1;
                    sumM += height;
                }
            }

            double biggest = people[0].getHeight();
            double smallest = people[0].getHeight();

            for (People person : people) {
                if (person.getHeight() > biggest) {
                    biggest = person.getHeight();
                }
                if (person.getHeight() < smallest) {
                    smallest = person.getHeight();
                }
            }

            System.out.println("---Data Result---");

            System.out.println();
            System.out.println("Number of mans: " + countM);
            System.out.println("Number of woman: " + countF);

            double averageF = sumF / countF;
            double averageM = sumM / countM;

            System.out.println();
            System.out.printf("Mans's average height: %.2f%n", averageM);
            System.out.printf("Woman's average height: %.2f%n", averageF);

            System.out.println();
            System.out.printf("Smallest height: %.2f%n", smallest);
            System.out.printf("Biggest height: %.2f%n", biggest);

        }
    }
}
