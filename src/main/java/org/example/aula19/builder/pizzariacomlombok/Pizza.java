package org.example.aula19.builder.pizzariacomlombok;

import lombok.Builder;

@Builder
public class Pizza {
    private String sabor;
    private boolean temQueijo;
    private String borda;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public boolean isTemQueijo() {
        return temQueijo;
    }

    public void setTemQueijo(boolean temQueijo) {
        this.temQueijo = temQueijo;
    }

    public String getBorda() {
        return borda;
    }

    public void setBorda(String borda) {
        this.borda = borda;
    }

    public void mostrar(){
        System.out.println("Pizza de sabor " + this.getSabor() + " com a borda de " + this.getBorda() + " e com extra de queijo: " + this.isTemQueijo());
    }
}