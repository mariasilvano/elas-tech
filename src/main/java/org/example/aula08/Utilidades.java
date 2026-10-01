package org.example.aula08;

public class Utilidades {

    public static void saudar(String nome){
        System.out.println("Olá, "+nome+"! Tudo bem?");
    }

    public static int dobro(int numero){
        return (numero*2);
    }

    public static double calcularMedia(double n1, double n2){
        return ((n1+n2)/2);
    }

    public static boolean ehMaiorDeIdade(int idade){
        return idade >= 18;
    }

    public static int somar(int num1, int num2){
        return (num1+num2);
    }

    public static int somar(int num1, int num2, int num3){
        return (num1+num2+num3);
    }

    public static double somar(double dec1, double dec2){
        return (dec1+dec2);
    }

    public static void saudacao(){
        System.out.println("Olá!");
    }

    public static void saudacao(String nome){
        System.out.println("Olá, "+nome+"!");
    }
}
