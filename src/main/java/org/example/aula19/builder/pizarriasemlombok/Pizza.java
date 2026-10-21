package org.example.aula19.builder.pizarriasemlombok;

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

    private Pizza(Builder builder){
        setSabor(builder.sabor);
        setTemQueijo(builder.temQueijo);
        setBorda(builder.borda);
    }

    public static class Builder{
        String sabor;
        boolean temQueijo;
        String borda;

        public Builder sabor(String sabor){
            this.sabor = sabor;
            return this;
        }

        public Builder temQueijo(boolean temQueijo){
            this.temQueijo = temQueijo;
            return this;
        }

        public Builder borda(String borda){
            this.borda = borda;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }

   public void mostrar(){
        System.out.println("Pizza de sabor " + this.getSabor() + " com a borda de " + this.getBorda() + " e com extra de queijo: " + this.isTemQueijo());
    }
}

