package org.example.revisao;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        /*5 - Crie uma classe chamada Produto com os atributos nome (String) e preco (double).
        Na classe principal, faça um laço for que repita 3 vezes.
        A cada repetição, o programa deve usar o Scanner para perguntar o nome e o preço de um produto.
        Instancie um novo Produto e guarde nele os valores digitados.
        Logo em seguida, faça um if: se o preço do produto for maior que 100, imprima "Produto caro!". Se for menor ou igual, imprima "Produto com preço acessível!". Use printf para mostrar o valor.
         */
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i <3;i++){
            Produto produto = new Produto();

            System.out.println("Digite o nome do produto:");
            produto.nome = sc.nextLine();
            System.out.println("Digite o preço do produto:");
            produto.preco = sc.nextDouble();
            sc.nextLine();

            if(produto.preco > 100){
                System.out.printf("Produto: %s, preço: %.2f - Produto caro! %n", produto.nome, produto.preco);
            }else{
                System.out.printf("Produto: %s, preço: %.2f - Produto com preço acessível! %n", produto.nome, produto.preco);
            }
        }
    }
}
