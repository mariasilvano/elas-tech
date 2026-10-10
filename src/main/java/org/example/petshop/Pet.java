package org.example.petshop;

public class Pet {
    //4. Juntando tudo num objeto
    public String nome;
    public String especie;
    public double peso;
    public String porte;

    public void definirPorte(){
        if(peso < 10){
            porte = "Pequeno";
        }else if(peso<25){
            porte = "Médio";
        }else{
            porte = "Grande";
        }
    }

    public void emitirSom(){
        System.out.println("Emitindo som...");
    }
}
