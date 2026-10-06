package org.example.aula11;

import java.util.ArrayList;
import java.util.List;

public class AulaArrayList {
    public static void main(String[] args){

        /*.add();
        .get();
        .size();
        .contains();
        .indexOf();
        .remove();
        .set();
        .isEmpty();
        .addAll(List.of());*/

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Ana");
        lista.add("Maria");
        lista.add("Lara");

        lista.addAll(List.of("Kati", "Carol", "Luiza"));

        System.out.println(lista);

        System.out.println(lista.get(3));

        lista.remove(3);

        System.out.println(lista);

        lista.set(2, "Dois aqui");

        System.out.println(lista);

        System.out.println(lista.contains("Kati"));
    }
}
