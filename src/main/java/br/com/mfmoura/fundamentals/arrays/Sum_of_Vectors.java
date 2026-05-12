package br.com.mfmoura.fundamentals.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Sum_of_Vectors {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();

            int[][] values = new int[n][2];

            String[] names = {"A", "B"};
            for (int j = 0; j < 2; j++) {
                System.out.println("Type the values of vector " + names[j] + ":");
                for (int i = 0; i < values.length; i++) {
                    values[i][j] = sc.nextInt();
                }
            }

            int[] sum = new int[n];

            for (int i = 0; i < sum.length; i++) {
                sum[i] = values[i][0] + values[i][1];
            }

            System.out.println("Sum of vectors:");
            for (int j : sum) {
                System.out.println(j);
            }

        }
    }
}
