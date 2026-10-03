package org.example.aula10;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        //5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número. Trate a ArithmeticException para o caso de ela digitar 0.

        int numero;
        int resto;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um numero:");
            numero = sc.nextInt();
            resto =  100 % numero;
            System.out.println("O resto da divisão de 100 por "+ numero + " é: " +resto);
        }catch (ArithmeticException ae){
            System.out.println("Não é possível fazer o resto da divisão por 0");
        }finally {
            sc.close();
        }
    }
}
