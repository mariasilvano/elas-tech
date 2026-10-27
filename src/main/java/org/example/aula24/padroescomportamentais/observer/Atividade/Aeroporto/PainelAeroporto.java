package org.example.aula24.padroescomportamentais.observer.Atividade.Aeroporto;

public class PainelAeroporto implements ObservadorVoo {

    @Override
    public void atualizar(String status, int numeroVoo) {
        System.out.println("Painel: o vôo " + numeroVoo + " tem um novo status: " +status);
    }
}
