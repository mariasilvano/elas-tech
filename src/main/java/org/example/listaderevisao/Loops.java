package org.example.listaderevisao;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        System.out.println("### Loops ###");
        System.out.println("### 1 - Imprima os números de 1 a 20, um por linha. ###");

        Scanner sc = new Scanner(System.in);
        int multiplicando;

        for(int i = 1; i<=20; i++){
            System.out.println(i);
        }

        System.out.println("\n### 2 - Imprima a contagem regressiva de 10 até 1 e depois \"Fim!\". ###");
        System.out.println("Contagem regressiva");
        for(int i = 10; i>=1; i--){
            System.out.println(i);
        }
        System.out.println("Fim!");

        System.out.println("\n### 3 - Peça um número e mostre a tabuada dele de 1 a 10.. ###");
        System.out.println("Digite um número para saber a tabuada");
        multiplicando = sc.nextInt();


        System.out.println("Tabuada do: "+ multiplicando);
        for(int tab = 1; tab<=10; tab++){
            System.out.println(multiplicando +" X "+ tab +" = " + (multiplicando*tab));
        }

        System.out.println("\n### 4 - Imprima só os números pares de 1 a 30.. ###");
        for(int i = 1; i<=30; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }

        System.out.println("\n### 5- Usando for, some todos os números de 1 a 100 e mostre o resultado. ###");
        int soma = 0;
        for(int i = 1; i<=100; i++){
            soma+=i;
        }
        System.out.println("Resultado: " +soma);

        System.out.println("\n### 6- Refaça o primeiro exercício com while. Compare os dois códigos. ###");

        int inicializador = 1;
        while(inicializador <= 20){
            System.out.println(inicializador);
            inicializador++;
        }

        System.out.println("\n### 7- Crie energia = 3. Usando do while, imprima \"Jogando...\" e diminua 1 enquanto for maior que 0. ###");

        int energia = 3;
        while(energia > 0){
            System.out.println("Jogando...");
            energia--;
        }

        System.out.println("\n### \uD83D\uDD25 Mini-desafio — Peça um número e desenhe um triângulo de asteriscos com essa altura: ###");


        int numero;
        System.out.println("Digite um número: ");
        numero = sc.nextInt();


        for (int i = 1; i <= numero; i ++){


            for(int i2=1 ; i2 <=i ; i2++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }


        //Digite a altura: 5 * ** *** **** *****


    }
}


