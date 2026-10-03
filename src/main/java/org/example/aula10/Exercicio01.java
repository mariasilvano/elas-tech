package org.example.aula10;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        //1 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo. Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando que não dá pra dividir por zero.

        int num1, num2, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("### Exercício 01 ###");

        try {
            System.out.println("Digite o primeiro número inteiro:");
            num1 = sc.nextInt();
            System.out.println("Digite o segundo número inteiro:");
            num2 = sc.nextInt();

            resultado = (num1/num2);
            System.out.println("O resultado de " + num1 +" dividido por "+ num2 + " é: " +resultado);
        }catch (ArithmeticException ae){
            System.out.println("Não é possível dividir por 0");
        }finally {
            sc.close();
        }
    }
}
