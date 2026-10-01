package org.example.aula04;

public class Desafio {
    public static void main() {

     /*Estruturas de Decisão:
    Desafio: Crie variáveis para três notas de uma aluna. Calcule a média e mostre: "Aprovada" se for 7 ou mais, "Recuperação" entre 5 e 6.9, e
    "Reprovada" abaixo de 5. Mostre também a média na tela. Valores: nota1 = 5.3, nota2 = 7.8 , nota3 = 4.5.*/

        System.out.println("Desafio - Estrutura de Decisão:");
        System.out.println("------------------------------------------");

        double nota1 = 5.3, nota2 = 7.8, nota3 = 4.5;
        calcularMedia(nota1, nota2, nota3);

        nota1 = 9; nota2 = 10; nota3 = 8;
        calcularMedia(nota1, nota2, nota3);

        nota1 = 2; nota2 = 5; nota3 = 3.5;
        calcularMedia(nota1, nota2, nota3);
    }

    public static void calcularMedia(double nota1,double nota2, double nota3){
        double media = ((nota1 + nota2 + nota3)/3);

        System.out.printf("Notas: %.2f, %.2f, %.2f%n", nota1, nota2, nota3);
        if (media >=7){
            System.out.println("Aprovada");
            System.out.printf("Sua média é: %.2f\n", media);
            System.out.println("------------------------------------------");
        }else if(media >=5 && media <= 6.9){
            System.out.println("Recuperação");
            System.out.printf("Sua média é: %.2f\n", media);
            System.out.println("------------------------------------------");
        }else{
            System.out.println("Reprovada");
            System.out.printf("Sua média é: %.2f\n", media);
            System.out.println("------------------------------------------");
        }
    }
}
