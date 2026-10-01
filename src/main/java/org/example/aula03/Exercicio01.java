package org.example.aula03;

public class Exercicio01 {
    public static void main(String[] args) {
       /*1- Crie variáveis para as notas de duas alunas. Mostre na tela o resultado de: são iguais, são diferentes, a primeira é maior,
       a primeira é menor para quando:
       */
        System.out.println("Exercício 01 - Operadores relacionais:");
        System.out.println("------------------------------------------");
        //a = 10, b = 3
        testarNotas(10,3);

        //a = 3, b = 10
        testarNotas(3,10);

        //a = 5, b = 5
        testarNotas(5,5);
    }
    public static void testarNotas(double notaAlunaA, double notaAlunaB){

        System.out.println("Nota Aluna A = " + notaAlunaA + ", Nota Aluna B = " + notaAlunaB);
        System.out.println("São iguais: " + (notaAlunaA == notaAlunaB));
        System.out.println("São diferentes: " + (notaAlunaA != notaAlunaB));
        System.out.println("A primeira é maior: " + (notaAlunaA > notaAlunaB));
        System.out.println("A primeira é menor: " + (notaAlunaA < notaAlunaB));

        System.out.println("------------------------------------------");

    }
}

