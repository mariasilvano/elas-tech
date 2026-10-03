package org.example.aula10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        //3 — Peça a idade da pessoa com scanner.nextInt(). Se ela digitar um texto em vez de um número, trate a InputMismatchException e mostre uma mensagem pedindo um número.
        System.out.println("### Exercício 03 ###");

        int idade;
        Scanner sc = new Scanner(System.in);
        boolean valido = false;

        System.out.println("Digite sua idade:");

        while (!valido) {
            try {
                idade = sc.nextInt();
                System.out.println("Sua idade é: " + idade);
                valido = true;
            } catch (InputMismatchException ime) {
                System.out.println("Por gentileza digite um número.");
                sc.next();
            }
        }

        sc.close();
    }
}
