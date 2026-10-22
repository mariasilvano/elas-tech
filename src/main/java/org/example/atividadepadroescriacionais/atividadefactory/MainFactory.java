package org.example.atividadepadroescriacionais.atividadefactory;

public class MainFactory {
    public static void main(String[] args) {

        Animal Luna = AnimalFactory.getAnimal("Cachorro");
        Animal Canjica = AnimalFactory.getAnimal("Gato");

        Luna.emitirSom();
        Canjica.emitirSom();
    }
}
