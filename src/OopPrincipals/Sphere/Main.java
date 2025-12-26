package OopPrincipals.Sphere;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)){

            System.out.println("Enter radius: ");
            double radius = sc.nextDouble();

            double a = area(radius);
            System.out.printf("Area: %.4f%n", a);

            double c = circumference(radius);
            System.out.printf("Circumference: %.2f%n", c);

            double v = volume(radius);
            System.out.printf("Volume: %.2f%n", v);

        }
    }


    public static double area(double radius) {
        return 4.0 * PI * Math.pow(radius, 2);
    }

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return (4.0 * PI * Math.pow(radius, 3)) / 3;
    }

}