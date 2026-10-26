package org.example.aula24.padroescomportamentais.observer.Atividade;

public class PainelAeroporto implements ObservadorVoo{

    @Override
    public void atualizar(String status, int numeroVoo) {
        System.out.println("Vôo: " + numeroVoo + " tem um novo status: " +status);
    }
}
