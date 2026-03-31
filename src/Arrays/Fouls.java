package Arrays;

import java.util.Scanner;

public class Fouls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();
        sc.nextLine();

        String[] names = new String[students];
        boolean[][] presence = new boolean[students][30];

        for (int i = 0; i < students; i++) {
            names[i] = sc.nextLine();

            for (int day = 0; day < 30; day++) {
                String status = sc.nextLine();

                presence[i][day] = status.equals("P");
            }
        }

        for (int i = 0; i < students; i++) {
            int absences = 0;

            for (int day = 0; day < 30; day++) {
                if (!presence[i][day]) {
                    absences++;
                }
            }

            if (absences > 10) {
                System.out.print(names[i] + " - days: ");

                for (int day = 0; day < 30; day++) {
                    if (!presence[i][day]) {
                        System.out.print((day + 1) + " ");
                    }
                }

                System.out.println();
            }
        }

        sc.close();
    }
}
