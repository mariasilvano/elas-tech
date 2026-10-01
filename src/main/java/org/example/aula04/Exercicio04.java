package org.example.aula04;

public class Exercicio04 {
    public static void main(String[] args) {

        /*Estruturas de Decisão:
         4 — Crie variáveis idade (17) e temAutorizacao (true). Mostre se a pessoa pode entrar na festa:
        precisa ter 18 anos OU ter autorização. Faça o mesmo para precisa ter 18 anos E ter autorização.
         */
        System.out.println("Exercício4 - Estrutura de Decisão:");
        System.out.println("------------------------------------------");
        int idade = 17;
        boolean temAutorizacao = true;

        autorizarEntrada(idade, temAutorizacao);

    }

    public static void autorizarEntrada(int idade, boolean temAutorizacao){
        System.out.println("validação tem 18 anos OU tem Autorização:");
        System.out.println("------------------------------------------");
        System.out.println("idade: "+idade);
        System.out.println("Tem Autorização: "+temAutorizacao);
        if(idade >= 18 || temAutorizacao){
            System.out.println("Pode entrar");
        }else {
            System.out.println("Não pode entrar");
        }

        System.out.println("------------------------------------------");
        System.out.println("validação tem 18 anos E tem Autorização:");
        System.out.println("------------------------------------------");
        System.out.println("idade: "+idade);
        System.out.println("Tem Autorização: "+temAutorizacao);
        if(idade >= 18 && temAutorizacao){
            System.out.println("Pode entrar");
        }else{
            System.out.println("Não pode entrar");
        }
    }
}
