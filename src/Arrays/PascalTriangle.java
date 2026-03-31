package Arrays;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        int[][] pascal = new int[length][length];

        for (int i = 0; i < pascal.length; i++) {
            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }

                System.out.print(pascal[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
