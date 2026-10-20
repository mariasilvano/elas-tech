package org.example.listaderevisao;

public class Aluna {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double media;

    public void calcularMedia(){
        media = ((nota1 + nota2 + nota3)/3);

        System.out.printf("A média é: %.2f", media);
    }
}
