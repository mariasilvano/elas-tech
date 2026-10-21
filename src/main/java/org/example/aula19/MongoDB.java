package org.example.aula19;

public class MongoDB implements BancoDeDados{
    int numero = 2;


    @Override
    public void chamarBanco() {
        System.out.println("O Banco conectado é o MongoDB");
    }

    public int getNumero(){
        return numero;
    }
}
