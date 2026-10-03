package org.example.aula10;

public class Exercicio04 {
    public static void main(String[] args) {
        //4 — Crie uma variável String nome = null; e tente imprimir nome.length(). Trate a NullPointerException e mostre "O nome não foi preenchido."

        String nome = null;

        try {
            System.out.println(nome.length());
        }catch (NullPointerException npe){
            System.out.println("O nome não foi preenchido.");
        }
    }
}
