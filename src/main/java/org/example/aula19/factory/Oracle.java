package org.example.aula19.factory;

public class Oracle implements BancoDeDados{
    int numero = 03;

    @Override
    public void chamarBanco() {
        System.out.println("O Banco conectado é o Oracle");
    }


    public int getNumero() {
        return numero;
    }
}
