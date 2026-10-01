package org.example.aula02;

public class Exercicio02 {
    public static void main(String[] args) {
       /*Aritméticos:
       2- Crie variáveis para dois números decimais de valor a = 10 e b = 3 e mostre na tela: soma, subtração, multiplicação, divisão e resto.
       " */
        double valorA = 10, valorB = 3;

        System.out.println("Exercício 02 - Aritméticos:");
        System.out.println("------------------------------------------");

        System.out.println("Valor A = " +valorA + ", Valor B:" +valorB);
        System.out.println("Soma = " + (valorA + valorB));
        System.out.println("Subtração = " + (valorA - valorB));
        System.out.println("Multiplicação = " + (valorA * valorB));
        System.out.println("Divisão = " + (valorA / valorB));
        System.out.println("Resto = " + (valorA % valorB));
    }
}
