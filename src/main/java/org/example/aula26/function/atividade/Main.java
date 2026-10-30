package org.example.aula26.function.atividade;

import java.util.function.Function;

public class Main {
    static void main() {
        Function<Integer, String> intergerToString = (Integer numNota) -> "Nota fiscal nº: " + numNota + ".";
        System.out.println(intergerToString.apply(1542));

        Function<String, Integer> stringToInteger = (String texto) ->  texto.length();
        System.out.println("Quantas letras tem a palara \"Professor\"? "+stringToInteger.apply("Professor") + " letras.");

    }
}
