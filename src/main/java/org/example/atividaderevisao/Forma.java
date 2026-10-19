package org.example.atividaderevisao;

public abstract class Forma {
    private String nome;

    public Forma(String nome){
        this.nome = nome;
    }

    public void exibirNome(){
        System.out.println("Nome da forma: " + nome);
    }

    public abstract double calcularArea();
}
