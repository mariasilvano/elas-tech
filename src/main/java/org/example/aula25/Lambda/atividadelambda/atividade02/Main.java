package org.example.aula25.Lambda.atividadelambda.atividade02;

public class Main {
    static void main() {
        Impressora impressoraMaiusculo = (String texto) -> System.out.println(texto.toUpperCase());
        Impressora impressoraMinusculo = (String texto) -> System.out.println(texto.toLowerCase());

        impressoraMaiusculo.imprimir("Meu Texto");
        impressoraMinusculo.imprimir("Meu Texto");
    }
}
