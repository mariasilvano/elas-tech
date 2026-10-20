package org.example.listaderevisao;

import java.util.Scanner;

public class RevisaoScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, cidade;
        int idade;
        double num1, num2;
        double peso, altura;

        System.out.println("### Scanner ###");
        System.out.println("### 1 - Pergunte o nome da pessoa e responda: \"Olá, [nome]!\" ###");

        System.out.println("Por gentileza informe o seu nome:");
        nome = sc.nextLine();


        System.out.println("Olá, " + nome + "!");

        System.out.println("### 2 - Pergunte a idade e responda quantos anos ela vai fazer no próximo aniversário. ###");
        System.out.println("Por gentileza informe a sua idade:");
        idade = sc.nextInt();

        System.out.println("Você tem " + idade + " anos. E fará: " + (idade + 1) + " no próximo aniversário!");

        System.out.println("### 3 - Pergunte dois números e mostre a soma. ###");
        System.out.println("Por gentileza digite dois números:");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));


        System.out.println("### 4 - Pergunte a altura e o peso e imprima os dois numa frase. ###");
        System.out.println("Por gentileza digite sua altura:");
        altura = sc.nextDouble();

        System.out.println("Por gentileza digite seu peso:");
        peso = sc.nextDouble();

        System.out.println("Você pesa " + peso + " e tem " + altura + " de altura.");


        System.out.println("\uD83D\uDD25 Mini-desafio — Faça um programa que peça, nesta ordem: a idade (número), o nome (texto) e a cidade (texto). Depois imprima tudo numa ficha.. ###");

        System.out.println("Digite sua idade");
        idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite seu nome");
        nome = sc.nextLine();

        System.out.println("Digite sua cidade");
        cidade = sc.nextLine();

        System.out.println("---- Ficha Cadastral: ----");
        System.out.println("Idade: " +idade);
        System.out.println("Nome: " +nome);
        System.out.println("Cidade: " +cidade);

    }
}

