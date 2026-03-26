package Set.courses.application;

import Set.courses.entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            Set<Student> students = new HashSet<>();

            for (int i = 0; i < 3; i++) {
                System.out.print("Hor many students for course " + (i+1) + ": ");
                int quantity = sc.nextInt();

                for (int j = 0; j < quantity; j++) {
                    int id = sc.nextInt();

                    students.add(new Student(id));
                }
            }

            System.out.println("Total students: " + students.size());

        }
    }
}
