package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Sum_of_Vectors {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();

            int[] a = new int[n];

            System.out.println("Type the values of vector A:");
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }

            int[] b = new int[n];

            System.out.println("Type the values of vector B:");
            for (int i = 0; i < b.length; i++) {
                b[i] = sc.nextInt();
            }

            int[] sum = new int[n];

            for (int i = 0; i < sum.length; i++) {
                sum[i] = a[i] + b[i];
            }

            System.out.println("Sum of vectors:");
            for (int j : sum) {
                System.out.println(j);
            }

        }
    }
}
