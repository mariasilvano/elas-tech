package org.example.aula26.consumer.atividade;

import java.util.function.Consumer;

public class Main {
    static void main() {

        Consumer<String> saudacao = (String nome) -> System.out.println("Olá, "+ nome);
        saudacao.accept("Maria");

        Consumer<String> saudacao2 = (String nome) -> System.out.println("Olá, "+ nome.toUpperCase());
        saudacao2.accept("Maria");
    }
}
