package br.com.mfmoura.fundamentals.conditionals;

import java.util.Scanner;

public class ItemPriceTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String produto;
        int cod, qtd;
        double valor, valorTotal;

        System.out.print("Digite o código do produto: ");
        cod = sc.nextInt();
        System.out.print("Digite a quantidade de produto: ");
        qtd = sc.nextInt();

        switch (cod) {
            case 1:
                produto = "Cachorro Quente";
                valor = 4.00;
                break;
            case 2:
                produto = "X-Salada";
                valor = 4.50;
                break;
            case 3:
                produto = "X-Bacon";
                valor = 5.00;
                break;
            case 4:
                produto = "Torrada Simples";
                valor = 2.00;
                break;
            case 5:
                produto = "Refrigerante";
                valor = 1.50;
                break;
            default:
                System.out.println("Valor Inválido");
                sc.close();
                return;
        }

        valorTotal = valor * qtd;
        System.out.printf("%d %s no valor total de %.2f%n", qtd, produto, valorTotal);

        sc.close();
    }
}
