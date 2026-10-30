package org.example.aula26.predicate;

import java.util.function.Predicate;

public class Main {
    //entra algo e sai como boolean
    static void main() {

    Predicate<Integer> maiorQueDez = (numero) -> numero > 10;

    System.out.println(maiorQueDez.test(5));

    }
}
