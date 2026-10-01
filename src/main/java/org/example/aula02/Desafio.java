package org.example.aula02;

public class Desafio {
    public static void main(String[] args) {
       /*
       Desafio: Crie uma variável com 3785 segundos. Mostre quantos minutos inteiros isso dá e quantos segundos sobram.
        */
        int minhaVariavelDeSegundo = 3785;

        System.out.println("Desafio - Aritméticos:");
        System.out.println("------------------------------------------");

        System.out.println("Minha variável tem " + (minhaVariavelDeSegundo/60) +" minutos e "+ (minhaVariavelDeSegundo%60) +" segundos.");

    }
}
