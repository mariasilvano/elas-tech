package org.example.aula07;

import java.util.Scanner;

public class AtividadeArrays {
    public static void main(String[] args) {
        //1 — Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.
        System.out.println("### Exercício 01 ###");

        String[] nomes = {"Maria", "Lucas", "Lara", "Eduardo", "Harrison"};

        System.out.println("Primeiro nome: "+ nomes[0]);
        System.out.println("Terceiro nome: "+ nomes[2]);
        System.out.println("Último nome: "+ nomes[4]);

        //2 — Crie um array com as notas {8, 6, 10, 7, 9}. Usando um laço, mostre todas, uma por linha, assim: "Nota 1: 8".
        System.out.println("### Exercício 02 ###");

        int[] notas = {8, 6, 10, 7, 9};
        int soma = 0;
        double media;

        for(int i = 0; i<notas.length; i++)  {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        //3 — Com o mesmo array de notas, calcule e mostre a soma e a média.
        System.out.println("### Exercício 03 ###");
        for(int i = 0; i<notas.length; i++)  {
            soma += notas[i];
        }

        media = (double) soma / notas.length;
        System.out.println("Soma das notas: " +soma);
        System.out.println("Média das notas: " + media);

        //4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.
        System.out.println("### Exercício 04 ###");
        int[] numeros = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 5 números: ");
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = sc.nextInt();
        }
        System.out.println("Números de trás pra frente:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
