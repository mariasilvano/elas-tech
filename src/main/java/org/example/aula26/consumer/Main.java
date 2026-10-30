package org.example.aula26.consumer;

import java.util.function.Consumer;

public class Main {
    static void main() {

        //Entra algo, nada sai
        Consumer<String> saudacao = (nome) -> System.out.println("Ola" + nome);
        saudacao.accept("Maria");

    }
}
