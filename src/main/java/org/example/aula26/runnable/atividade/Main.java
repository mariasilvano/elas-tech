package org.example.aula26.runnable.atividade;

public class Main {
    static void main() {
    Runnable runnable01 = () -> System.out.println("executando tarefa");
    Runnable runnable02 = () -> System.out.println("Executando a segunda Runnable...");


        runnable01.run();
        runnable02.run();
    }
}
