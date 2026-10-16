package org.example.petshop;

public class Gato extends Pet {

    public Gato(String nome, String especie, double peso) {
        super(nome, especie, peso);
    }

    @Override
    public String emitirSom() {
        return getNome() + ": faz Miau!";
    }
}