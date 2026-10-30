package org.example.aula25.lambda.atividadelambda.atividade04;

public class Main {
    static void main() {

        repetirAcao(() -> System.out.println("oi"));

    }

    static void repetirAcao(Acao acao){
        acao.executar();
        acao.executar();
    }
}
