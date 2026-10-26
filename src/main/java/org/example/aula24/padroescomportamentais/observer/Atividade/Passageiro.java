package org.example.aula24.padroescomportamentais.observer.Atividade;

public class Passageiro implements ObservadorVoo{
    private String nome;

    public Passageiro(String nome){
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String status, int numeroVoo) {
        System.out.println(" [" + nome +"] o status do seu vôo " + numeroVoo  + " é: " + status);
    }
}
