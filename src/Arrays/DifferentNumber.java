package Arrays;

import java.util.Scanner;

public class DifferentNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] values = new int[10];

        for (int i = 0; i < values.length; i++) {
            while (true) {
                System.out.print("Enter your value: ");
                values[i] = sc.nextInt();

                boolean repeated = false;
                for (int j = 0; j < i; j++) {
                    if (values[i] == values[j]) {
                        repeated = true;
                        break;
                    }
                }

                if (repeated) {
                    System.out.println("Repeated number, try again!");
                } else {
                    break;
                }
            }
        }

        System.out.println();
        for (int value : values) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}
