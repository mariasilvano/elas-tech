package org.example.aula24.padroescomportamentais.observer.Atividade.Aeroporto;

public class Main {
    static void main() {
        Voo voo17589 = new Voo(17589);

        Voo voo17588 = new Voo(17588);

        Passageiro maria = new Passageiro("Maria");
        Passageiro joana = new Passageiro("Joana");
        PainelAeroporto painel01 = new PainelAeroporto();


        voo17589.adicionarObservador(maria);
        voo17589.mudarStatus("Embarque iniciado.");

        voo17588.adicionarObservador(joana);
        voo17588.adicionarObservador(painel01);
        voo17588.mudarStatus("Atrasado");


    }
}
