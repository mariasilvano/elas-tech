package org.example.listaderevisao;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {

        System.out.println("### Condicionais ###");
        System.out.println("### 1 - Peça a idade e diga se a pessoa é maior ou menor de idade. ###");

        Scanner sc = new Scanner(System.in);

        int idade, numero, num1, num2, opcao;
        double nota, lado1, lado2, lado3;

        System.out.println("Digite sua idade:");
        idade = sc.nextInt();
        if (idade>=18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }

        System.out.println("\n### 2 - Peça um número e diga se ele é par ou ímpar. ###");

        System.out.println("Digite um número:");
        numero = sc.nextInt();

        if(numero%2 == 0){
            System.out.println("Número é par");
        }else {
            System.out.println("Número é ímpar");
        }



        System.out.println("\n### 3 - Peça dois números e diga qual é o maior. Se forem iguais, avise.. ###");

        System.out.println("Digite o primeiro número:");
        num1 = sc.nextInt();


        System.out.println("Digite o segundo número:");
        num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("O primeiro número é maior");

        } else if (num2 > num1) {
            System.out.println("O segundo número é maior");
        }else {
            System.out.println("São iguais");
        }

        System.out.println("\n### 4 - Peça uma nota e mostre \"Aprovada\" (7 ou mais), \"Recuperação\" (5 a 6.9) ou \"Reprovada\". ###");

        System.out.println("Digite sua nota:");
        nota = sc.nextDouble();
        if(nota >= 7){
            System.out.println("Aprovada");
        } else if (nota >=5) {
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovada");
        }

        System.out.println("\n### 5 - Peça um número de 1 a 3 e, usando switch, mostre um sabor de sorvete pra cada opção.. ###");

        System.out.println("Escolha um sabor 1-Chocolate/2-Morango/3-Baunilha");
        opcao = sc.nextInt();
        switch(opcao){
            case 1:
                System.out.println("Chocolate");
                break;
            case 2:
                System.out.println("Morango");
                break;
            case 3:
                System.out.println("Baunilha");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        System.out.println("\n### 6 - //Peça a idade e diga o valor do ingresso: menos de 12 ou 60 ou mais paga R$ 10; o resto paga R$ 25.. ###");

        System.out.println("Por gentileza informe sua idade:");
        idade = sc.nextInt();


        if(idade < 12 || idade>=60){
            System.out.println("O ingresso é R$ 10");
        }else{
            System.out.println("O ingresso é R$ 25");
        }
        //🔥 Mini-desafio — Peça os três lados de um triângulo e classifique: todos iguais → Equilátero; dois iguais → Isósceles; todos diferentes → Escaleno.
        System.out.println("\n### \uD83D\uDD25 Mini-desafio — Peça os três lados de um triângulo e classifique: todos iguais → Equilátero; dois iguais → Isósceles; todos diferentes → Escaleno.. ###");

        System.out.println("Digite os três lados de um triângulo: ");
        lado1 = sc.nextDouble();
        lado2 = sc.nextDouble();
        lado3 = sc.nextDouble();


        if(lado1 == lado2 && lado2 == lado3){
            System.out.println("Triângulo Equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Triângulo Isósceles");
        }else {
            System.out.println("Triângulo Escaleno");
        }
    }
}

