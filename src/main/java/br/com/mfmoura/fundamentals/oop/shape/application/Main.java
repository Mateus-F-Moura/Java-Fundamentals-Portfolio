package br.com.mfmoura.fundamentals.oop.shape.application;

import br.com.mfmoura.fundamentals.oop.shape.entities.Circle;
import br.com.mfmoura.fundamentals.oop.shape.entities.Rectangle;
import br.com.mfmoura.fundamentals.oop.shape.entities.Shape;
import br.com.mfmoura.fundamentals.oop.shape.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of shapes: ");
            int n = sc.nextInt();

            List<Shape> shapes = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                System.out.println();
                System.out.println("#" + (i+1) + " Shape data:");

                System.out.print("Rectangle or Circle (r/c)? ");
                char typeOption = sc.next().charAt(0);

                System.out.print("Color: ");
                sc.nextLine();
                Color color = Color.valueOf(sc.nextLine());

                Shape shape = switch (typeOption) {
                    case 'r' -> {
                        System.out.print("Width: ");
                        double width = sc.nextDouble();

                        System.out.print("Height: ");
                        double height = sc.nextDouble();

                        yield new Rectangle(color, width, height);
                    }
                    case 'c' -> {
                        System.out.print("Radius: ");
                        double radius = sc.nextDouble();

                        yield new Circle(color, radius);
                    }
                    default -> throw new IllegalStateException("Unexpected value: " + typeOption);
                };

                shapes.add(shape);
            }

            System.out.println();
            System.out.println("Shape areas: ");
            for (Shape s : shapes) {
                System.out.printf("%.2f", s.area());
            }
        }
    }
}
