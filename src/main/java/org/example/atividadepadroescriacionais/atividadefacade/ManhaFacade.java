package org.example.atividadepadroescriacionais.atividadefacade;

public class ManhaFacade {

    private Cafeteira cafeteira = new Cafeteira();
    private Chuveiro chuveiro = new Chuveiro();
    private Despertador despertador = new Despertador();

    public void acordar(){
        despertador.desligar();
        cafeteira.fazerCafe();
        chuveiro.ligar();
    }
}
