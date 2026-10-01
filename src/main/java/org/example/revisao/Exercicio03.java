package org.example.revisao;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        /*
            3 - Usando um do-while e um switch, crie um menu interativo. O menu deve oferecer três opções:
                1 - Ver camisas
                2 - Ver calças
                3 - Sair
             Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha. Se digitar uma opção inválida, avise. O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3.
        */

        int opcao = 0;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Escolha uma opção do menu: ");
            System.out.println("1 - Ver camisas");
            System.out.println("2 - Ver calças");
            System.out.println("3 - Sair");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Buscando camisas...");
                    break;
                case 2:
                    System.out.println("Buscando calças...");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao != 3);
    }
}
