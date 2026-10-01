package org.example.revisao;

public class Exercicio04 {
    public static void main(String[] args){
        /*4 - Crie uma classe chamada Pet.
        Dê a ela três atributos: nome (String), raca (String) e peso (double).
        Em outra classe, instancie (crie) dois objetos diferentes dessa classe (por exemplo, um cachorro e um gato).
        Atribua valores para os atributos de cada um deles.
        Imprima os dados dos dois pets concatenando textos e variáveis.
         */

        Pet gato = new Pet();

        gato.nome = "Garfield";
        gato.raca = "Persa";
        gato.peso = 18.00;

        Pet cachorro = new Pet();

        cachorro.nome = "Luna";
        cachorro.raca = "SRD";
        cachorro.peso = 5.00;

        System.out.println(gato.nome + " é um gato da raça " +gato.raca + ". No filme e nos quadrinhos, o gato "+ gato.nome+" costuma ser descrito com um peso de cerca de " + gato.peso+ " kg.");

        System.out.println("Eu tenho uma cachorrinha chamada " +cachorro.nome+ ", da raça " +cachorro.raca + " que pesa cerca de " +cachorro.peso+" kg.");
    }
}
