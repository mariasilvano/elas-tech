package org.example.aula25.lambda.atividadelambda.atividade03;

public class Main {
    static void main() {
        Calculo soma = (int a, int b) -> a +b;
        Calculo multiplicacao = (int a, int b) -> a *b;
        Calculo maiorDe = (int a, int b) -> Math.max(a,b);

        System.out.println(soma.calcular(10, 5));
        System.out.println(multiplicacao.calcular(10,5));
        System.out.println(maiorDe.calcular(10,5));
    }
}
