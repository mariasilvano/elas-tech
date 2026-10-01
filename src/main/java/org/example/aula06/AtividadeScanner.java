package org.example.aula06;

import java.util.Scanner;

public class AtividadeScanner {
    public static void main(String[] args) {
        //1 - Peça o nome da pessoa e a idade dela. Exemplo: "Oi Ana, você tem 28 anos e vai fazer 29 no próximo aniversário."
        System.out.println("### Exercício 01 ###");
        String nome;
        int idade;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nome = sc.nextLine();

        System.out.println("Digite sua idade:");
        idade = sc.nextInt();

        System.out.println("Oi " +nome.trim()+", você tem "+idade+" anos e vai fazer "+(idade+1)+ " no próximo aniversário.");


        //2 - Peça dois números inteiros e mostre a soma, a subtração, a multiplicação, a divisão e o resto.
        System.out.println("### Exercício 02 ###");
        int numero1;
        int numero2;
        System.out.println("Digite um número inteiro:");
        numero1 = sc.nextInt();

        System.out.println("Digite outro número inteiro:");
        numero2 = sc.nextInt();

        System.out.println("Soma: " + (numero1 + numero2));
        System.out.println("Subtração: " + (numero1 - numero2));
        System.out.println("Multiplicação: " + (numero1 * numero2));
        System.out.println("Divisão: " + (numero1 / numero2));
        System.out.println("Resto: " + (numero1 % numero2));

        //3 - Peça a nota de uma aluna e mostre se ela foi aprovada (7 ou mais), ficou de recuperação (entre 5 e 6.9) ou foi reprovada.
        double nota;
        System.out.println("### Exercício 03 ###");
        System.out.println("Digite sua nota:");
        nota = sc.nextDouble();

        if(nota >= 7){
            System.out.println("Nota: " + nota + ". Aprovada!");
        }else if(nota >=5){
            System.out.println("Nota: " + nota + ". Recuperação!");
        }else{
            System.out.println("Nota: +" + nota + ". Reprovada!");
        }

        //4 - Peça um número e mostre a tabuada dele de 1 a 10.
        int multiplicando;
        System.out.println("### Exercício 04 ###");
        System.out.println("Digite um número para ver a tabuada:");
        multiplicando = sc.nextInt();

        System.out.println("Tabuada do: "+ multiplicando);
        for(int i = 1; i<=10; i++){
            System.out.println(multiplicando +" X "+ i +" = " + (multiplicando*i));
        }
    }
}
