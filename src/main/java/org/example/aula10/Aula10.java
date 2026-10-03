package org.example.aula10;

public class Aula10 {
    public static void main(String[] args){

        try {
            int resultado = 10 / 0;
            System.out.println(resultado);
        }catch(ArithmeticException ae){
            System.out.println("Divisão por zero!!!");
        }finally{
            System.out.println("Isso sempre acontece");
        }

        System.out.println("O programa continua");
    }

}
