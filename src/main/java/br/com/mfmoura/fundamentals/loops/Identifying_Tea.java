package br.com.mfmoura.fundamentals.loops;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Identifying_Tea {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            int teaType;
            do {
                teaType = sc.nextInt();
            } while (teaType < 1 || teaType > 4);

            int[] answer = new int[5];
            int countCorrect = 0;

            for (int i = 0; i < answer.length; i++) {
                do {
                    answer[i] = sc.nextInt();
                } while (answer[i] < 1 || answer[i] > 4);
                if (answer[i] == teaType) {
                    countCorrect += 1;
                }
            }

            System.out.println(countCorrect);

        }

    }

}