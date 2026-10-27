package org.example.aula24.padroescomportamentais.observer.Atividade.Estoque;

public class Main {
    static void main() {
        RegistroEstoque r01 = new RegistroEstoque();

        r01.atualizar(100);
        r01.atualizar(500);
    }
}
