package org.example.aula02;

public class Concatenacao {
    /*Concatenação:
    1- Crie variáveis para um nome, uma cidade e uma idade. Mostre em uma única linha: "Meu nome é Ana, moro em Salvador e tenho 28 anos."
    2 — Crie variáveis para o nome de um produto ("Caneca"), o preço (12.50) e a quantidade (4). Mostre: "Comprei 4 unidades de Caneca por R$ 12.5 cada. Total: R$ 50.0"
    3- Crie duas variáveis com números inteiros. Mostre a soma em uma frase completa, assim: "A soma de 15 e 4 é igual a 19."
    */
    static void main() {

        String nome = "Maria";
        String cidade = "Dois Vizinhos";
        int idade = 25;

        System.out.println("Exercício 01 - Concatenação:");
        System.out.println("------------------------------------------");
        System.out.println("Meu nome é " + nome + ", moro em "+ cidade + " e tenho " +idade+ " anos.");

        String nomeProduto = "Kit Kat";
        double preco = 2.99;
        int quantidade = 3;

        System.out.println("------------------------------------------");
        System.out.println("Exercício 02 - Concatenação:");
        System.out.println("------------------------------------------");
        System.out.println("Comprei "+ quantidade + " unidades de " +nomeProduto+ " por R$ "+ preco +" cada. Total: R$" + (preco*quantidade)+".");

        int numero1 = 27;
        int numero2 = 10;

        System.out.println("------------------------------------------");
        System.out.println("Exercício 03 - Concatenação:");
        System.out.println("------------------------------------------");
        System.out.println("A soma de "+numero1+" e "+numero2+" é igual a "+ (numero1 + numero2) +".");

    }

}
