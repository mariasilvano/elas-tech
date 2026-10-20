package org.example.listaderevisao;

public class VariaveisETipos {
    public static void main(String[] args){
        System.out.println("### Variáveis e tipos ###");
        System.out.println("### 1 -Crie variáveis com seu nome, sua idade, sua altura e se você já programou antes. Imprima cada uma. ###");

        String nome = "Maria";
        int idade = 25;
        double altura = 1.67;
        boolean jaProgramou = true;
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Já programou antes? " + jaProgramou);

        System.out.println("\n### 2 -Crie uma variável cidade e imprima: \"Eu moro em Salvador.\" ###");
        String cidade = "Salvador";
        System.out.println("Eu moro em " + cidade + ".");

        System.out.println("\n### 3 -Crie primeiroNome e sobrenome e imprima o nome completo numa linha só. ###");
        String primeiroNome = "Maria" , sobrenome = "Silvano";
        System.out.println("Meu nome completo é: " + primeiroNome + " " + sobrenome + ".");

        System.out.println("\n### 4 -Crie uma variável preco com 29.90 e imprima o valor dela numa frase. ###");
        double preco = 29.90;
        System.out.printf("Essa camiseta custa apenas R$ %.2f.%n", preco);

        System.out.println("\n### 5 -Crie uma variável temCarteira com true e imprima. ###");
        boolean temCarteira = true;

        System.out.println("Você tem carteira? " + temCarteira);

        System.out.println("\n### \uD83D\uDD25 Mini-desafio — Você tem a = 10 e b = 20. Faça a valer 20 e b valer 10, sem escrever os números 10 e 20 de novo. ###");
        int a = 10, b = 20, c = 0;

        c=a;
        a=b;
        b=c;

        System.out.println("A = "+a);
        System.out.println("B = "+b);

    }
}
