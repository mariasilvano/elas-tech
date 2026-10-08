package org.example.atividadeforeach;

import java.util.ArrayList;
import java.util.List;

public class Exercicio02 {
    public static void main() {
        System.out.println("\n### 2. Crie um ArrayList com 5 notas e imprima todas usando for-each. ###");

        ArrayList<Double> notas = new ArrayList<>();

        notas.addAll(List.of(9.8, 7.6,8.4,6.9,10.0));

        for (Double nota : notas){
            System.out.println(nota);
        }

    }
}
