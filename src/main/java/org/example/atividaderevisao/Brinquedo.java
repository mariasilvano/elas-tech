package org.example.atividaderevisao;

public class Brinquedo {

    private String nome;

    public Brinquedo(String nome){
        this.nome = nome;
    }


    public void verBrinquedo(Brinquedo brinquedo){
        System.out.println("O brinquedo escolhido foi: "+ brinquedo.nome);
    }
}
