package org.example.aula25.lambda.lambda1;

import org.example.aula25.lambda.aula.Calculo;

public class Main {
    static void main() {

        Saudacao saudacao = () -> System.out.println("Oie");
        saudacao.executar();

        Impressora textoMaiusculo = (texto) -> System.out.println(texto.toUpperCase());
        Impressora textoMinusculo = texto -> System.out.println(texto.toLowerCase());

        textoMaiusculo.imprimir("Meu Texto");
        textoMinusculo.imprimir("Meu Texto");

        Calculo soma = (a, b) -> a + b;
        Calculo multiplicacao = (a, b) -> a * b;
        Calculo maiorQue = (a, b) -> Math.max(a,b);

        System.out.println(soma.calcular(10,20));
        System.out.println(multiplicacao.calcular(10,20));
        System.out.println(maiorQue.calcular(10,20));
    }
}
