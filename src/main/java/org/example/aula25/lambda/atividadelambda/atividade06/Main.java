package org.example.aula25.lambda.atividadelambda.atividade06;

import org.example.aula25.lambda.atividadelambda.atividade04.Acao;

public class Main {
    static void main() {
        executarSe(
                valor -> valor % 2 == 0,
                4,
                () -> System.out.println("é par!"));
        executarSe(valor -> valor % 2 == 0, 7, () -> System.out.println("é par!"));
    }

    static void executarSe(Condicao cond, int valor, Acao acao){
        if (cond.testar(valor)) {
            acao.executar();
        }
    }
}
