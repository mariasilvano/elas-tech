package org.example.listaderevisao;

public class ConcatenacaoEPrintf {
    public static void main(String[] args) {
        System.out.println("### Concatenação e printf ###");
        System.out.println("### 1 -Com seu nome e sua idade em variáveis, imprima: \"Ana tem 28 anos.\" ###");

        String nome = "Ana";
        int idade = 28;


        System.out.println(nome+" tem " + idade + " anos.");

        System.out.println("\n### 2 -Crie nota1 = 8.0 e nota2 = 7.0. Calcule a média e imprima com duas casas decimais. ###");

        double nota1 = 8, nota2 = 7;

        System.out.printf("Média das notas %.2f\n", ((nota1+nota2)/2));

        System.out.println("\n### 3 -Crie uma variável com o preço de um produto e imprima com duas casas decimais. ###");
        double preco = 2.99;

        System.out.printf("O preço do KiKat é %.2f\n", preco);

        System.out.println("\n### 4 - Usando printf, imprima numa linha só o nome, a idade e a altura. ###");

        nome = "Josefina";
        idade = 61;
        double altura = 1.60;

        System.out.printf("Seu nome é %s, tem %d anos e sua altura é %.2f.\n", nome, idade, altura);

        System.out.println("\n\uD83D\uDD25 Mini-desafio — Crie variáveis para três produtos (nome e preço) e imprima um recibo. Cada linha deve ter o nome e o preço, e a última linha mostra o total, tudo com duas casas decimais.");

        String produto1 = "Chocolate", produto2 = "Coca-Cola", produto3 = "Salgadinho";
        double preco1 = 5.99, preco2 = 10.00, preco3 = 7.90;
        double total = preco1 + preco2 + preco3;

        System.out.println("### Recibo ###");
        System.out.printf("%s -- %.2f%n", produto1, preco1);
        System.out.printf("%s -- %.2f%n", produto2, preco2);
        System.out.printf("%s -- %.2f%n", produto3, preco3);
        System.out.printf("Total ------ %.2f%n", total);

    }
}
