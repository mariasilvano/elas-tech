package org.example.aula04;

public class Exercicio01 {
    public static void main(String[] args) {
          /*Estruturas de Decisão:
           1 — Crie uma variável idade e mostre a categoria de uma pessoa: menos de 13 anos é "Criança",
           de 13 a 17 é "Adolescente", de 18 a 59 é "Adulto" e 60 ou mais é "Idoso".
           */

        System.out.println("Exercício 1 - Estrutura de Decisão:");
        System.out.println("------------------------------------------");

        int idade = 5;
        System.out.println("Idade = " + idade + " -> Categoria: " + validarFaixaEtaria(idade));

        //Criança
        idade = 12;
        System.out.println("Idade = " + idade + " -> Categoria: " + validarFaixaEtaria(idade));


        //Adolescente
        idade = 16;
        System.out.println("Idade = " + idade + " -> Categoria: " + validarFaixaEtaria(idade));


        //Adulto
        idade = 25;
        System.out.println("Idade = " + idade + " -> Categoria: " + validarFaixaEtaria(idade));


        //Idoso
        idade = 68;
        System.out.println("Idade = " + idade + " -> Categoria: " + validarFaixaEtaria(idade));

    }

    public static String validarFaixaEtaria(int idade){

        if(idade < 13) {
            return "Criança";
        }else if(idade>=13 && idade <= 17){
            return "Adolescente";
        }else if(idade>=18 && idade <= 59){
            return "Adulto";
        }else{
            return "Idoso";
        }

    }
}
