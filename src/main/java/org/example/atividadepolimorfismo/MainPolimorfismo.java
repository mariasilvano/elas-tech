package org.example.atividadepolimorfismo;

public class MainPolimorfismo {

    public static void main(String[] args) {

        System.out.println("### Atividade Polimorfismo ###");

        System.out.println("\n### 1. (mesma classe — muda a QUANTIDADE de parâmetros)\n" +
                "\n" +
                "   Crie a classe Calculadora com TRÊS métodos chamados calcularArea():\n" +
                "   - recebe um double (lado do quadrado)  -> lado * lado\n" +
                "   - recebe dois double (base e altura)   -> base * altura\n" +
                "   - recebe um int (raio do círculo)      -> 3.14159 * raio * raio\n" +
                "\n" +
                "   Chame os três na Main e imprima os resultados.\" ###\n");

        Calculadora calculadora = new Calculadora();

        System.out.println("Área do círculo: " + calculadora.calcularArea(10));
        System.out.println("Área do triângulo: "+ calculadora.calcularArea(10.00, 20.00));
        System.out.println("Área do quadrado: "+calculadora.calcularArea(8.0));

        System.out.println("\n### 2. (mesma classe — muda o TIPO do parâmetro)\n" +
                "\n" +
                "   Crie a classe Painel com QUATRO métodos chamados exibir, cada um\n" +
                "   recebendo um tipo diferente: String, int, boolean e double.\n" +
                "   Cada um imprime de um jeito, dizendo que tipo recebeu.\n" +
                "\n" +
                "   Chame os quatro.\n" +
                "\n" +
                "   Depois pense: por que o System.out.println() aceita texto, número,\n" +
                "   boolean e objeto, ao invés de ter um método println para cada? É exatamente isso que vocês acabaram de fazer. ###\n");

        Painel.exibir("Texto-texto-texto-texto");
        Painel.exibir(897563);
        Painel.exibir(true);
        Painel.exibir(897.563);

    }
}
