package org.example.aula26.predicate.atividade;

import java.util.function.Predicate;

public class Main {
    static void main() {
        Predicate<Integer> ehMaiorQueDez  = (Integer numero) -> numero > 10;

        System.out.println("5 é maior que dez? " + ehMaiorQueDez.test(5)+"\n");
        System.out.println("15 é maior que dez? " +ehMaiorQueDez.test(15)+"\n");

        Predicate<String> ehVazio = (String texto) -> texto.isEmpty();

        System.out.println("O texto \"\" é vazio? " + ehVazio.test("")+"\n");
        System.out.println("O texto \"Java\" é vazio? " +ehVazio.test("Java")+"\n");
    }
}
