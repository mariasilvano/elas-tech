package org.example.revisao;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
    /*1 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele. Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00. No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
    Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n*/

        String nomeLanche;
        double valorLanche;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Lanche desejado:");
        nomeLanche = sc.nextLine();

        System.out.println("Digite o valor do Lanche desejado:");
        valorLanche = sc.nextDouble();

        if(valorLanche > 30){
            valorLanche = valorLanche - 5;
        }

        System.out.printf("O lanche %s custa R$ %.2f.", nomeLanche, valorLanche);

    }
}
