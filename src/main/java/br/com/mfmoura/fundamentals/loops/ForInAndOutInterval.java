package br.com.mfmoura.fundamentals.loops;

import java.util.Scanner;

public class ForInAndOutInterval {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, x, in = 0, out = 0;

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            if (x > 10 && x < 20){
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in e " + out + " out");

        sc.close();
    }

}
