package org.example.aula25.lambda.lambda2;

public class Main {
    static void main() {
        repetirAcao(() -> System.out.println("oi"));
    }

    static void repetirAcao(Acao acao){
        acao.executar();
        acao.executar();
    }
}
