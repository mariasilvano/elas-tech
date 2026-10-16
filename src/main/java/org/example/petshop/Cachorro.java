package org.example.petshop;

public class Cachorro extends Pet{

    public Cachorro(String nome, String especie, double peso) {
        super(nome, especie, peso);
    }
    @Override
    public String emitirSom() {
        return getNome() + ": faz Au au!";
    }
}
