package org.example.singleton;

public class TesteSingleton {
    //variável que vai receber o objeto do tipo da classe
    private static TesteSingleton instancia;

    //construtor sempre privado
    private TesteSingleton(){

    }

    //Criar um getter, deve validar se está vazio (lazy)
    public static TesteSingleton getInstancia(){
        if(instancia == null){
            instancia = new TesteSingleton();
        }

        return instancia;
    }
}
