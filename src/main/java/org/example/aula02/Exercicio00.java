package org.example.aula02;

public class Exercicio00 {
       /*Aritméticos:
       0- Rode esse código:
       System.out.println("2 + 2 = " + 2 + 2);.
       Agora rode:
       System.out.println("2 + 2 = " + (2 + 2));
       Explique em um comentário por que deram resultados diferentes.*/

    static void main() {

        System.out.println("Exercício 00 - Aritméticos:");
        System.out.println("------------------------------------------");

        //Nesse caso ele está apenas concatenando os dois números e por isso é impresso 22
        System.out.println("2 + 2 = " + 2 + 2);

        //Nesse caso ele entendeu que se trata de uma operação de soma pois a expressão foi colocada entre parênteses e os dois números são somados, imprimindo o resultado que é 4
        System.out.println("2 + 2 = " + (2 + 2));
    }
}
