package br.com.mfmoura.fundamentals.loops;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String usuarioForm, senhaForm, usuario, senha;

        System.out.println("== Crie sua conta ==");
        System.out.print("Digite seu nome de usuário: ");
        usuario = sc.nextLine();
        System.out.print("Digite sua senha: ");
        senha = sc.nextLine();

        System.out.println("== Faça login na sua conta ==");

        while (true) {
            System.out.print("Digite seu nome de usuário: ");
            usuarioForm = sc.nextLine();
            System.out.print("Digite sua senha: ");
            senhaForm = sc.nextLine();
            if (usuarioForm.equals(usuario) && senhaForm.equals(senha)){
                System.out.println("\nAcesso permitido!");
                break;
            } else {
                System.out.println("\nAcesso Negado");
            }
        }

        sc.close();
    }
}
