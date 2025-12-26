package OopPrincipals.Rectangle;

import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("== Rectangle Calculator ==");
            System.out.println();

            Rectangle rectangle = new Rectangle();

            do {
                System.out.print("Enter the width value: ");
                rectangle.width = sc.nextDouble();
                System.out.print("Enter the height value: ");
                rectangle.height = sc.nextDouble();
            } while (rectangle.width < 0 || rectangle.height < 0);

            System.out.println();
            System.out.println(rectangle);
        }
    }
}