package org.example.atividadeinterface;

public class Moto implements Veiculo{
    @Override
    public void ligar() {
        System.out.println("A moto está ligando...");
    }

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando...");
    }
}
