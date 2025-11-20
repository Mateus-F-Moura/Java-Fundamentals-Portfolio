package Arrays.Height.application;

import Arrays.Height.entities.Height;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)){

            System.out.print("How many people you want to type: ");
            int n = sc.nextInt();
            Height[] heights = new Height[n];

            double heightsSum = 0.0;
            int belowSixteenCount = 0;
            for (int i = 0; i < heights.length; i++) {
                sc.nextLine();

                System.out.println("== Person number " + (i + 1) + " ==");
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Age: ");
                int age = sc.nextInt();
                System.out.print("Height: ");
                double height = sc.nextDouble();

                heights[i] = new Height(name, age, height);

                heightsSum += height;

                if (age < 16) {
                    belowSixteenCount += 1;
                }
            }

            double averageHeight = heightsSum / heights.length;

            System.out.println();
            System.out.printf("Average height: %.2f%n", averageHeight);

            if (belowSixteenCount > 0) {
                double belowSixteenPercentage = ((double) belowSixteenCount / heights.length) * 100;

                System.out.printf("Persons with age below Sixteen: %.1f%%%n", belowSixteenPercentage);

                for (Height height : heights) {
                    if (height.getAge() < 16) {
                        System.out.println(height.getName());
                    }
                }
            }
        }
    }
}
