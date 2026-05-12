package br.com.mfmoura.fundamentals.loops;

import java.util.Scanner;

public class WhileFuelPreference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int voto, alcool = 0, gasolina = 0, diesel = 0;

        System.out.println("1 - Alcool\n2 - Gasolina\n3 - Diesel\n0 - Sair");

        while (true) {
            System.out.print("\nDigite o tipo de combustível abastecido: ");
            voto = sc.nextInt();
            switch (voto) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                default:
                    System.out.println("Número Inválido");
                    break;
            }
            if (voto == 0) {
                System.out.println("Muito obrigado!");
                break;
            }
        }

        System.out.println("\n== Resultado Total ==");
        System.out.println("\nAlcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}

