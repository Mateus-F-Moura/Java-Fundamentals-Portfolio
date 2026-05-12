package br.com.mfmoura.fundamentals.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();

            double[][] matrix = new double[n][n];

            int negativeCount = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = sc.nextDouble();
                    if (matrix[i][j] < 0) {
                        negativeCount++;
                    }
                }
            }

            System.out.println();
            System.out.println("Overview: ");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                    if (j == (matrix.length - 1)) {
                        System.out.print("\n");
                    }
                }
            }

            System.out.println();
            System.out.println("Negative numbers count: " + negativeCount);

            System.out.println();
            System.out.print("Main Diagonal: ");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i == j) {
                        System.out.printf("%.2f ", matrix[i][j]);
                    }
                }
            }

            System.out.println();
            System.out.println("Secondary Diagonal: ");
            for (int i = 0; i < matrix.length; i++) {
                int collum = (matrix.length - 1) - i;

                System.out.printf("%.2f ", matrix[i][collum]);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
