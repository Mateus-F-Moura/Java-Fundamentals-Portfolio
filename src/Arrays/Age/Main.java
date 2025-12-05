package Arrays.Age;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("How many people add: ");
            int n = sc.nextInt();
            sc.nextLine();

            Person[] people = new Person[n];

            for (int i = 0; i < people.length; i++) {
                System.out.println("== Enter the person number " + i + " ==");

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Age: ");
                int age = sc.nextInt();
                sc.nextLine();

                people[i] = new Person(name, age);
            }

            String olderName = people[0].getName();
            int olderAge = people[0].getAge();
            for (Person person : people) {
                if (person.getAge() > olderAge) {
                    olderName = person.getName();
                    olderAge = person.getAge();
                }
            }

            System.out.println("Older person: " + olderName + " with " + olderAge + "y old");

        }
    }
}
