package org.example.aula10;

public class Exercicio06 {
    public static void main(String[] args) {
        //6 — Crie um array com 3 nomes. Mostre o nome da posição 5 de propósito e trate a ArrayIndexOutOfBoundsException com a mensagem "Essa posição não existe." Depois do try/catch, imprima "O programa continua funcionando."

        String[] nomes = {"Maria","Luiza", "Carol"};

        try {
            System.out.println(nomes[5]);
        }catch (ArrayIndexOutOfBoundsException aioobe){
            System.out.println("Essa posição não existe.");
        }

        System.out.println("O programa continua funcionando.");
    }
}
