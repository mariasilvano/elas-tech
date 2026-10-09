package org.example.atividadepolimorfismo;

public class Painel {

    public static void exibir(String parametro) {
        System.out.println("Esse método está recebendo a String: " +parametro);
    }

    public static void exibir(int parametro) {
        System.out.println("Esse método está recebendo o int: " +parametro);
    }
    public static void exibir(boolean parametro) {
        System.out.println("Esse método está recebendo o boolean: " +parametro);
    }

    public static void exibir(double parametro) {
        System.out.println("Esse método está recebendo o double: " +parametro);
    }
}
