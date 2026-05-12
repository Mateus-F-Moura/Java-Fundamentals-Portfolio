package br.com.mfmoura.fundamentals.arrays;

import java.util.Locale;
import java.util.Scanner;

public class MatrixLocalizer {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Set line(s): ");
            int l = sc.nextInt();
            System.out.print("Set collum(s): ");
            int c = sc.nextInt();

            int[][] matrix = new int[l][c];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            System.out.println();
            System.out.print("Localize a value position: ");
            int x = sc.nextInt();

            int occurrences = 0;
            System.out.println();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == x) {
                        occurrences++;
                        System.out.println();
                        System.out.println("Position [" + i + "," + j + "]:");
                        if (j > 0) {
                            System.out.println("Left: " + matrix[i][j-1]);
                        }
                        if (i > 0) {
                            System.out.println("Up: " + matrix[i-1][j]);
                        }
                        if (j < (matrix[i].length-1)) {
                            System.out.println("Right: " + matrix[i][j+1]);
                        }
                        if (i < (matrix.length-1)) {
                            System.out.println("Down: " + matrix[i+1][j]);
                        }
                    }
                }
            }

            System.out.println();
            System.out.println("A total of " + occurrences + " occurrences of " + x);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
