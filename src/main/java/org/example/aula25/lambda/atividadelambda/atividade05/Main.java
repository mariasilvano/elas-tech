package org.example.aula25.lambda.atividadelambda.atividade05;

public class Main {
    static void main() {

        mostrarResultado(valor -> valor * 2, 5);
        mostrarResultado(valor -> valor * valor, 5);
        mostrarResultado(valor -> valor * -1, 5);

    }
    static void mostrarResultado(Operacao op, int valor){
        System.out.println(op.aplicar(valor));
    }
}
