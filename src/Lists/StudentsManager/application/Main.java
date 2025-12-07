package Lists.StudentsManager.application;

import Lists.StudentsManager.entities.Course;
import Lists.StudentsManager.entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            List<Course> courses = new ArrayList<>();

            System.out.println("===== Catholic University of Pernambuco =====");

            System.out.println();
            System.out.println("-----Courses Registration-----");
            System.out.print("Number of courses to insert: ");
            int nCourses = sc.nextInt();

            for (int i = 0; i < nCourses; i++) {
                System.out.println();
                System.out.println("#" + (i + 1) + " Course:");
                System.out.print("Course name: ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.print("Number of vacancies on the course: ");
                int vacancies = sc.nextInt();

                Course course = new Course(name, vacancies);

                courses.add(course);
            }

            List<Student> students = new ArrayList<>();

            System.out.println();
            System.out.println("-----Students Registration-----");
            System.out.print("Number of students to insert: ");
            int nStudents = sc.nextInt();

            for (int i = 0; i < nStudents; i++) {
                System.out.println();
                System.out.println("#" + (i + 1) + " Student:");
                System.out.print("Academic Record: ");
                int ar = sc.nextInt();

                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.print("E-mail: ");
                String email = sc.nextLine();

                System.out.print("Course: ");
                String course = sc.nextLine();

                boolean courseFound = false;
                for (Course c : courses) {
                    if (course.equalsIgnoreCase(c.getName())) {
                        Student student = new Student(ar, name, email, course);

                        try {
                            c.addStudent(student);

                            students.add(student);

                            System.out.println();
                            System.out.println("Student successfully enrolled");
                        } catch (RuntimeException e) {
                            System.out.println("Error when registering: " + e.getMessage());
                        }

                        courseFound = true;
                        break;
                    }
                }

                if (!courseFound) {
                    System.out.println("Course not found!");
                }
            }

            System.out.println();
            System.out.println("All students overview: ");
            for (Student s : students) {
                System.out.println(s);
            }

            System.out.println();
            System.out.println("All courses overview: ");
            for (Course c : courses) {
                System.out.println();
                System.out.println(c);
                System.out.println("Students:");
                for (int i = 0; i < c.getStudents().size(); i++) {
                    System.out.println("- " + c.getStudents().get(i).getName());
                }
            }

        }
    }
}
