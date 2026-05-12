package br.com.mfmoura.fundamentals.interfaces.taxing.application;

import br.com.mfmoura.fundamentals.interfaces.taxing.model.entities.Circle;
import br.com.mfmoura.fundamentals.interfaces.taxing.model.entities.Rectangle;
import br.com.mfmoura.fundamentals.interfaces.taxing.model.entities.Square;
import br.com.mfmoura.fundamentals.interfaces.taxing.model.services.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Quantas formas voce quer cadastrar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.printf("Forma #%d%n", i);
            System.out.print("Rectangle, Circle ou Square (r/c/s)? ");
            char type = sc.next().toLowerCase().charAt(0);

            switch (type) {
                case 'r' -> {
                    System.out.print("Width: ");
                    double width = sc.nextDouble();
                    System.out.print("Height: ");
                    double height = sc.nextDouble();
                    shapes.add(new Rectangle(width, height));
                }
                case 'c' -> {
                    System.out.print("Radius: ");
                    double radius = sc.nextDouble();
                    shapes.add(new Circle(radius));
                }
                case 's' -> {
                    System.out.print("Side: ");
                    double side = sc.nextDouble();
                    shapes.add(new Square(side));
                }
                default -> {
                    System.out.println("Tipo invalido. Tente de novo.");
                    i--; // repete este indice
                }
            }
        }

        System.out.println();
        System.out.println("AREAS:");
        for (Shape shape : shapes) {
            System.out.printf("%.2f%n", shape.area());
        }

        sc.close();
    }
}
