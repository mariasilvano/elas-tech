package org.example.aula24.padroescomportamentais.observer.Atividade.Estoque;

import java.util.ArrayList;

public class Estoque {

    ArrayList<ObservadorEstoque> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorEstoque o){
        observadores.add(o);
    }

    public void setQuantidade(int quantidade){
        for(ObservadorEstoque observador:observadores){
            observador.atualizar(quantidade);
        }
    }
}
