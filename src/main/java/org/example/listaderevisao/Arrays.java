package org.example.listaderevisao;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        System.out.println("### Operadores ###");
        System.out.println("### 1 - Crie um array com 5 nomes. Imprima o primeiro, o terceiro e o último. ###");

        Scanner sc = new Scanner(System.in);

        String[] nomes={"Maria", "Marinilsa", "Gabriela", "Lara", "Luiza"};
        System.out.println(nomes[0]);
        System.out.println(nomes[2]);
        System.out.println(nomes[4]);


        System.out.println("\n### 2 - Crie um array com as notas {8, 6, 10, 7, 9} e imprima todas usando um laço. ###");
        int[] notas = {8,6,10,7,9};
        int soma = 0;


        for(int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);

            soma+= notas[i];

        }

        System.out.println("\n### 3 - Com o mesmo array, calcule e imprima a soma e a média. ###");
        System.out.println("Soma das notas:" + soma +".");
        System.out.println("Média das notas: "+ (soma / notas.length)+".");


        System.out.println("\n### 4 - Crie um array com 5 números e descubra qual é o maior. ###");
        int[] numeros = {8,6,10,7,9};
        int maior = 0;


        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
        }
        System.out.println("O maior número é: " +maior + ".");


        System.out.println("\n### 5 - Com {8, 5, 10, 4, 7}, conte quantas notas são maiores ou iguais a 7. ###");
        int[] notas2 = {8, 5, 10, 4, 7};
        int contador = 0;


        for(int i = 0; i < notas2.length; i++){
            if(notas2[i]>=7){
                contador++;
            }
        }

        System.out.println(contador + " notas são maiores ou iguais a 7.");

        System.out.println("\n### \uD83D\uDD25 Mini-desafio — Crie um array com 5 nomes. Peça um nome pra pessoa e diga em qual posição ele está. Se não estiver na lista, avise. ###\n");

        String[] nomes2={"Maria", "Marinilsa", "Gabriela", "Lara", "Luiza"};
        String nome;
        int validador = -1;


        System.out.println("Digite um nome para procurar:");
        nome = sc.nextLine();


        for(int i = 0; i< nomes2.length; i++){
            if(nomes2[i].equalsIgnoreCase(nome)){
                validador = i;
                break;
            }
        }

        if(validador >= 0 ){
            System.out.println("Nome encontrado na posição:" + validador +".");
        }else {
            System.out.println("O nome não está na lista");
        }
    }
}

