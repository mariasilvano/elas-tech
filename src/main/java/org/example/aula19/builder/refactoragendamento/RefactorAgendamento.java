package org.example.aula19.builder.refactoragendamento;

import lombok.Builder;

@Builder
public class RefactorAgendamento {
    private  String nomePet;
    private String servico;
    private String horario;
    private boolean perfume;
    private boolean laco;
    private boolean hidratacao;
    private String observacao;
    private double desconto;

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public boolean isHidratacao() {
        return hidratacao;
    }

    public void setHidratacao(boolean hidratacao) {
        this.hidratacao = hidratacao;
    }

    public boolean isLaco() {
        return laco;
    }

    public void setLaco(boolean laco) {
        this.laco = laco;
    }

    public boolean isPerfume() {
        return perfume;
    }

    public void setPerfume(boolean perfume) {
        this.perfume = perfume;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public void mostrar(){
        System.out.println("\nPet: " + getNomePet());
        System.out.println("Serviço: " + getServico());
        System.out.println("Horário: " + getHorario());
        System.out.println("Perfume: " + isPerfume());
        System.out.println("Laço: " + isLaco());
        System.out.println("Hidratação: " + isHidratacao());
        System.out.println("Observação: " + getObservacao());
        System.out.println("Desconto: " + getDesconto());
    }
}
