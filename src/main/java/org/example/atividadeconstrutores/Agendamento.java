package org.example.atividadeconstrutores;

public class Agendamento {

    public  String nomePet;
    public String servico;
    public String horario;
    public boolean perfume;
    public boolean laco;
    public boolean hidratacao;
    public String observacao;
    public double desconto;

    public Agendamento(String nomePet, String servico, String horario, boolean perfume, boolean laco, boolean hidratacao, String observacao, double desconto ){
        setNomePet(nomePet);
        setServico(servico);
        setHorario(horario);
        setPerfume(perfume);
        setLaco(laco);
        setHidratacao(hidratacao);
        setObservacao(observacao);
        setDesconto(desconto);
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public boolean isPerfume() {
        return perfume;
    }

    public void setPerfume(boolean perfume) {
        this.perfume = perfume;
    }

    public boolean isLaco() {
        return laco;
    }

    public void setLaco(boolean laco) {
        this.laco = laco;
    }

    public boolean isHidratacao() {
        return hidratacao;
    }

    public void setHidratacao(boolean hidratacao) {
        this.hidratacao = hidratacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
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
