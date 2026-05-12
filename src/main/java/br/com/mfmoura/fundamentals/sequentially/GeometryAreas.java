package br.com.mfmoura.fundamentals.sequentially;

import java.util.Scanner;
import java.util.Locale;

public class GeometryAreas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, areaTri, areaCir, areaTra, areaSqu, areaRet;
        final double PI = 3.14159;

        System.out.println("Enter A value: ");
        a = sc.nextDouble();
        System.out.println("Enter B value: ");
        b = sc.nextDouble();
        System.out.println("Enter C value: ");
        c = sc.nextDouble();

        areaTri = (a * c) / 2;
        System.out.printf("Área do Triângulo Retangulo: %.3f%n", areaTri);

        areaCir = Math.pow(c, 2) * PI;
        System.out.printf("Área do Circulo: %.3f%n", areaCir);

        areaTra = (a + b) * c / 2;
        System.out.printf("Área do Trapézio: %.3f%n", areaTra);

        areaSqu = b * b;
        System.out.printf("Área do Quadrado: %.3f%n", areaSqu);

        areaRet = a * b;
        System.out.printf("Área do Retangulo: %.3f%n", areaRet);

        sc.close();
    }
}
