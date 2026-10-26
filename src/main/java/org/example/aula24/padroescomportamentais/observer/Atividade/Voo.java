package org.example.aula24.padroescomportamentais.observer.Atividade;

import org.example.aula24.padroescomportamentais.observer.Inscrito;

import java.util.ArrayList;

public class Voo {
    private ArrayList<ObservadorVoo> passageiros = new ArrayList<>();
    int numeroVoo;

    public Voo(int numeroVoo){
        setNumeroVoo(numeroVoo);
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public void adicionarObservador(ObservadorVoo o){
        this.passageiros.add(o);
    }

    public void mudarStatus(String status){
        for(ObservadorVoo  observador: passageiros){
            observador.atualizar(status, numeroVoo);
        }
    }


}
