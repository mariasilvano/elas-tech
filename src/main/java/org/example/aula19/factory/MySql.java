package org.example.aula19.factory;

public class MySql implements BancoDeDados{
    int numero = 01;

    @Override
    public void chamarBanco() {
        System.out.println("O Banco conectado é o MySQL");
    }

    public int getNumero() {
        return numero;
    }
}
