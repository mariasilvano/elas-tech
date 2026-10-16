package org.example.petshop;

public class OutroPet extends Pet {
        public OutroPet(String nome, String especie, double peso) {
            super(nome, especie, peso);
        }

        @Override
        public String emitirSom() {
            return getNome() + ": emite um som.";
        }
}

