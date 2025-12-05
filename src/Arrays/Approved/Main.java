package Arrays.Approved;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("How many student you wanna type: ");
            int n = sc.nextInt();
            sc.nextLine();

            Student[] students = new Student[n];

            System.out.println();
            for (int i = 0; i < students.length; i++) {
                System.out.println("Enter name, first and second grade of the" + (i + 1) + "o student:");
                String name = sc.nextLine();
                double[] grades = {sc.nextDouble(), sc.nextDouble()};
                sc.nextLine();

                students[i] = new Student(name, grades);
            }

            System.out.println();
            System.out.println("Approved students:");
            for (Student student : students) {
                if (student.average() >= 6.0) {
                    System.out.printf("%s with a %.2f average.%n", student.getName(), student.average());
                }
            }

        }
    }
}
