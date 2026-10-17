package org.example.singleton;

public class AulaSingleton {
    public static void main(String[] args) {

        TesteSingleton testeS = TesteSingleton.getInstancia();

        ConexaoBanco bd = ConexaoBanco.getInstancia();



    }
}
