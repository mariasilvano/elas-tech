package org.example.aula10;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        //2 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição. Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.
        System.out.println("### Exercício 02 ###");

        double[] notas = {8.7, 6.1, 10, 7.3, 5.4};
        int posicao;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Qual posição você deseja consultar (de 0 a 4)?");
            posicao = sc.nextInt();
            System.out.println("A nota na posição " + posicao + " é: " + notas[posicao]);
        }catch (ArrayIndexOutOfBoundsException aioobe){
            System.out.println("Não existe essa nota. As notas vão de 0 a 4!");
        }finally {
            sc.close();
        }

    }
}
