package org.example.aula26.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    static void main() {

        //Supplier nada entra, algo sai
        Supplier<String> avisoSistema = () -> "Aviso: O sistema está online!";

        System.out.println(avisoSistema.get());

        Supplier<Integer> geradorNumero = () -> new Random().nextInt(100);

        System.out.println("Primeiro: " +geradorNumero.get());
        System.out.println("Segundo: " +geradorNumero.get());
    }
}
