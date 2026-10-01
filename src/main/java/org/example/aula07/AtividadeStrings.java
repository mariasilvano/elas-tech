package org.example.aula07;

import java.util.Scanner;

public class AtividadeStrings {
    public static void main(String[] args){
        //1 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).
        System.out.println("### Exercício 01 ###");
        String nomeCompleto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome completo:");
        nomeCompleto = sc.nextLine();
        System.out.println("Tamanho do nome: "+ nomeCompleto.length());

        //2 — Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.
        String nome;
        System.out.println("### Exercício 02 ###");
        System.out.println("Digite seu nome:");
        nome = sc.nextLine();
        System.out.println("Nome com letras maiúsculas: "+ nome.toUpperCase());
        System.out.println("Nome com letras minúsculas: "+ nome.toLowerCase());


        //3 — Peça o nome da pessoa e mostre a primeira letra dele.
        System.out.println("### Exercício 03 ###");
        System.out.println("Digite seu nome:");
        nome = sc.nextLine();
        System.out.println("Primeira letra do nome: "+ nome.charAt(0));

        //4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.
        String frase;
        String palavra;

        System.out.println("### Exercício 04 ###");
        System.out.println("Digite uma frase:");
        frase = sc.nextLine();
        System.out.println("Digite uma palavra para procurar na frase:");
        palavra = sc.nextLine();

        System.out.println("A palavra aparece na frase? "+ frase.toLowerCase().contains(palavra.trim().toLowerCase()));

        //5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.
        String nome1;
        String nome2;

        System.out.println("### Exercício 05 ###");
        System.out.println("Digite seu nome:");
        nome1 = sc.nextLine();
        System.out.println("Digite seu nome:");
        nome2 = sc.nextLine();

        System.out.println("Os nomes são iguais? "+ nome1.trim().equalsIgnoreCase(nome2.trim()));

    }
}
