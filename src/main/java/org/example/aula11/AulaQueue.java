package org.example.aula11;

import java.util.ArrayDeque;
import java.util.List;

public class AulaQueue {
    public static void main(String[] args) {
        /*
        .add("Ana");
        .peek();
        .poll();
        .isEmpty();
        .size();
        .contains("Bia");
        .addAll(List.of("Ana","Bia"));
        */

        ArrayDeque<String> fila = new ArrayDeque<>();

        fila.add("Flora");
        fila.add("Ana");

        fila.addAll(List.of("Maria", "Bia"));
        System.out.println(fila);

        System.out.println(fila.peek());
        System.out.println(fila.poll());
        System.out.println(fila.poll());


    }
}
