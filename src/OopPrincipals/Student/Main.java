package OopPrincipals.Student;

import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("== Student ==");
            System.out.println();

            Student student = new Student();

            System.out.print("Name: ");
            student.name = sc.nextLine();
            System.out.print("Grades: ");
            for (int i = 0; i < student.grades.length; i++) {
                double maxGrade = (i == 0) ? 30.00 : 35.00;

                do {
                    student.grades[i] = sc.nextDouble();
                    if (student.grades[i] < 0 || student.grades[i] > maxGrade) {
                        System.out.println("Invalid value! Must be between 0 and " + maxGrade + ". Try again.");
                    }
                } while (student.grades[i] < 0 || student.grades[i] > maxGrade);
            }

            System.out.println();
            System.out.println("--- Resultado ---");
            System.out.println(student);

        }


    }
}