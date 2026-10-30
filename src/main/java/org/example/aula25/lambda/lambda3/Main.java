package org.example.aula25.lambda.lambda3;

public class Main {
    static void main() {

        mostrarResultado((valor)-> valor *2,5);

    }

    static void mostrarResultado(Operacao op, int valor){
        System.out.println(op.aplicar(valor));
    }
}
