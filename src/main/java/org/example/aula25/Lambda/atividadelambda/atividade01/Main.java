package org.example.aula25.Lambda.atividadelambda.atividade01;

public class Main {
    static void main() {

        Saudacao saudacao = () -> System.out.println("oi");

        saudacao.executar();
    }
}
