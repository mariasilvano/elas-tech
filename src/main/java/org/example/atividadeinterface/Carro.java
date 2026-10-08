package org.example.atividadeinterface;

public class Carro implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("O carro está ligando...");
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando...");
    }
}
