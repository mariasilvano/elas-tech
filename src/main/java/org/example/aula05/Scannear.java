package org.example.aula05;

import java.util.Scanner;

public class Scannear {

    public static void main() {

        Scanner scanner = new Scanner(System.in);
        String nome;

        System.out.println("Escreva seu nome:");
        nome = scanner.nextLine();

        System.out.println("Bem vindo(a): " + nome);
    }
}
