package org.example.aula26.supplier.atividade;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    static void main() {
        Supplier<String> aviso = () -> "Aviso: O sistema está online!";

        Supplier<Integer> numeroAleatorio =  () -> new Random().nextInt(100);

        System.out.println(numeroAleatorio.get());
        System.out.println(numeroAleatorio.get());

    }
}
