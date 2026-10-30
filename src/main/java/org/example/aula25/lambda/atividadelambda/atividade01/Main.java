package org.example.aula25.lambda.atividadelambda.atividade01;

public class Main {
    static void main() {

        Saudacao saudacao = () -> System.out.println("oi");

        saudacao.executar();
    }
}
