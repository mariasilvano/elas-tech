package org.example.atividadeforeach;

public class Exercicio01 {
    public static void main(String[] args) {
        //1. Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each,
        //   um por linha.

        System.out.println("### Atividade For Each ###");

        System.out.println("\n### 1. Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each, um por linha. ###");

        String[] nomes = {"Ana", "Maria", "José", "João"};

        for (String nome : nomes){
            System.out.println(nome);
        }

    }
}
