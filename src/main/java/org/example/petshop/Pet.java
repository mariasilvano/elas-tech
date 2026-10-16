package org.example.petshop;

public abstract class Pet {
    //4. Juntando tudo num objeto
    private String nome;
    private String especie;
    private double peso;

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public Pet(String nome, String especie, double peso) {
        this.nome = nome;
        this.especie = especie;
        this.peso = peso;
    }

    public String getPorte() {
        if(peso < 10){
          return  "Pequeno";
        }else if(peso<25){
            return "Médio";
        }else{
            return "Grande";
        }
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public abstract String emitirSom();
}
