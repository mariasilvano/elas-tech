package org.example.aula04;

public class Exercicio03 {
    public static void main(String[] args) {

        /*Estruturas de Decisão:
         3 — Crie uma variável opcao com um número de 1 a 4 e, usando switch, mostre o
          pedido escolhido no cardápio: 1 é Café, 2 é Cappuccino, 3 é Chocolate quente e 4 é Chá. Qualquer outro número mostra "Opção inválida
         */
        System.out.println("Exercício3 - Estrutura de Decisão:");
        System.out.println("------------------------------------------");

        //Café
        fazerPedido(1);

        //Cappuccino
        fazerPedido(2);

        //Chocolate
        fazerPedido(3);

        //Chá
        fazerPedido(4);

        //Inválida
        fazerPedido(5);
    }


    public static void fazerPedido(int opcao){

        switch (opcao){
            case 1:
                System.out.println("Opção:" + opcao);
                System.out.println("Café");
                break;
            case 2:
                System.out.println("Opção:" + opcao);
                System.out.println("Cappuccino");
                break;
            case 3:
                System.out.println("Opção:" + opcao);
                System.out.println("Chocolate");
                break;
            case 4:
                System.out.println("Opção:" + opcao);
                System.out.println("Chá");
                break;
            default:
                System.out.println("Opção:" + opcao);
                System.out.println("Opção inválida");
                break;
        }
    }
}


