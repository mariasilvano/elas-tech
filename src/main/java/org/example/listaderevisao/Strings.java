package org.example.listaderevisao;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        System.out.println("### Strings ###");
        System.out.println("### 1 - Peça o nome completo e mostre quantas letras ele tem. ###");

        String nome;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um nome");
        nome = sc.nextLine();

        System.out.println("O nome tem: " + nome.length() +" letras.");

        System.out.println("\n### 2 - Peça o nome e mostre em MAIÚSCULO e em minúsculo. ###");

        System.out.println("Digite um nome");
        nome = sc.nextLine();

        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());


        System.out.println("\n### 3 - Peça o nome e mostre a primeira letra. ###");
        System.out.println("Digite um nome");
        nome = sc.nextLine();
        System.out.println(nome.charAt(0));

        System.out.println("\n### 4 - Peça uma frase e uma palavra. Diga se a palavra aparece na frase. ###");
        String frase;
        String palavra;

        System.out.println("Digite uma frase:");
        frase = sc.nextLine();
        System.out.println("Digite uma palavra para procurar na frase:");
        palavra = sc.nextLine();

        System.out.println("A palavra aparece na frase? "+ frase.toLowerCase().contains(palavra.trim().toLowerCase()));


        System.out.println("\n### 5 - Peça o nome duas vezes e diga se os dois são iguais, ignorando maiúsculas. ###");
        String nome1;
        String nome2;

        System.out.println("Digite seu nome:");
        nome1 = sc.nextLine();
        System.out.println("Digite seu nome:");
        nome2 = sc.nextLine();


        System.out.println("Os nomes são iguais? "+ nome1.trim().equalsIgnoreCase(nome2.trim()));


        System.out.println("\n### 6 - Peça um nome e mostre em maiúsculo, sem espaços nas pontas (dois métodos encadeados). ###");

        System.out.println("Digite seu nome:");
        nome = sc.nextLine();

        System.out.println(nome.toUpperCase().trim());

        System.out.println("\n### \uD83D\uDD25 Mini-desafio — Peça uma palavra e diga se ela começa e termina com a mesma letra, ignorando maiúscula e minúscula. ###");
        //Exemplos: ana → sim · Ovo → sim · casa → não

        String palavra2;

        System.out.println("Digite uma palavra:");
        palavra2 = sc.nextLine();
        palavra2 = palavra2.toLowerCase();

        System.out.println("A palavra começa e termina com a mesma letra? " + (palavra2.charAt(0) == palavra2.charAt((palavra2.length() -1))));
    }
}


