package OopPrincipals.Heron_Formula;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            Triangle x = new Triangle();
            writeArrayDouble(sc, x.lados);
            System.out.println("SemiPerímetro de X: " + x.getSemiPerimetro());
            System.out.println("Área de X: " + x.getArea());

            Triangle y = new Triangle();
            writeArrayDouble(sc, y.lados);
            System.out.println("SemiPerímetro de Y: " + y.getSemiPerimetro());
            System.out.println("Área de Y: " + y.getArea());

        } catch (Exception e){
            System.out.println("Something went wrong.");
        }
    }

    public static void writeArrayDouble(Scanner sc, double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
        }
    }
}