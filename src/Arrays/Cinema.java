package Arrays;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[][] seats = new boolean[10][10];

        System.out.print("Enter how many tickets: ");
        int tickets = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < tickets; i++) {
            while (true) {
                System.out.print("Choose the seat for the " + (i + 1) + "th ticket (x,x): ");
                String seat = sc.nextLine();

                String[] fields = seat.split(",");
                int row = Integer.parseInt(fields[0]);
                int column = Integer.parseInt(fields[1]);

                if (!seats[row][column]) {
                    seats[row][column] = true;
                    break;
                } else {
                    System.out.println("Seat already taken, try again!");
                }
            }
        }

        for (boolean[] seatRow : seats) {
            for (boolean occupied : seatRow) {
                System.out.print(occupied + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
