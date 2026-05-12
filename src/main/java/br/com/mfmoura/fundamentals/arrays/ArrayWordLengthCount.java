package br.com.mfmoura.fundamentals.arrays;

import java.util.Scanner;

public class ArrayWordLengthCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdPalavra, escopo, maisCount = 0, menosCount = 0, igualCount = 0;

        System.out.print("Digite a quantidade de palavras que você quer na lista: ");
        qtdPalavra = sc.nextInt();

        String[] strings = new String[qtdPalavra];
        ArrayWordLengthCount.escreverArray(strings);

        System.out.print("\nDigite quantas letras você quer criar o escopo: ");
        escopo = sc.nextInt();

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > escopo) {
                maisCount ++;
            } else if (strings[i].length() == escopo) {
                igualCount ++;
            } else {
                menosCount ++;
            }
        }

        System.out.println("\n==RESULTADO==");

        System.out.println("\n" + maisCount + " palavra com número maior que " + escopo + " letras: ");
        ArrayWordLengthCount.lerListaMaiorEscopo(strings, escopo);

        System.out.println("\n" + igualCount + " palavra com mesmo número igual a " + escopo + " letras: ");
        ArrayWordLengthCount.lerListaIgualEscopo(strings, escopo);

        System.out.println("\n" + menosCount +" palavra com número menor que " + escopo + " letras: ");
        ArrayWordLengthCount.lerListaMenorEscopo(strings, escopo);

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Feito por: Mateus Ferreira de Moura! 😎");

        sc.close();
    }

    public static void escreverArray (String[] lista) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < lista.length; i++) {
            System.out.print("Digite a palavra " + (i+1) + ": ");
            lista[i] = sc.nextLine();
        }

        sc.close();
    }

    public static void lerListaMaiorEscopo (String[] lista, int escopo) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].length() > escopo) {
                System.out.println(lista[i]);
            }
        }
    }

    public static void lerListaIgualEscopo (String[] lista, int escopo) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].length() == escopo) {
                System.out.println(lista[i]);
            }
        }
    }

    public static void lerListaMenorEscopo (String[] lista, int escopo) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].length() < escopo) {
                System.out.println(lista[i]);
            }
        }
    }
}
