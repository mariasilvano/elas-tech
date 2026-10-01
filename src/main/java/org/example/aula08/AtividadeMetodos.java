package org.example.aula08;

import java.util.Scanner;

public class AtividadeMetodos {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //1 — Na mesma classe do main, crie um método chamado mostrarBoasVindas() que imprime "Bem-vinda ao curso de Java!". Chame ele no main
        System.out.println("### Exercício 01 ###");
        mostrarBoasVindas();

        //2 — Crie um método saudar(String nome) que imprime "Olá, [nome]! Tudo bem?". Chame ele três vezes, passando nomes diferentes.
        System.out.println("### Exercício 02 ###");
        Utilidades.saudar("Flora");
        Utilidades.saudar("Maria");
        Utilidades.saudar("Canjica");

        //3 — Crie um método dobro(int numero) que devolve o dobro do número recebido. No main, chame ele e mostre o resultado.
        System.out.println("### Exercício 03 ###");
        System.out.println("O dobro do número 197 é: "+ Utilidades.dobro(197));

        //4 — Crie um método calcularMedia(double n1, double n2) que devolve a média das duas notas. No main, peça as duas notas com Scanner e mostre a média com duas casas decimais.
        double n1, n2;
        System.out.println("### Exercício 04 ###");
        System.out.println("Digite a primeira nota: ");
        n1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        n2 = sc.nextDouble();

        System.out.printf("Nota1: %.2f, Nota2: %.2f, a média das duas notas é: %.2f\n", n1, n2, Utilidades.calcularMedia(n1,n2));

        //5 — Crie um método ehMaiorDeIdade(int idade) que devolve true ou false. No main, peça a idade e use o retorno do método dentro de um if para imprimir se a pessoa é maior ou menor de idade.
        int idade;
        System.out.println("### Exercício 05 ###");
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        if (Utilidades.ehMaiorDeIdade(idade)){
            System.out.println("Você é maior de idade");
        }else {
            System.out.println("Você é menor de idade");
        }

        //6 — Crie três métodos com o mesmo nome somar:
        System.out.println("### Exercício 06 ###");
        System.out.println("Soma de 10 e 23: " + Utilidades.somar(10, 23));
        System.out.println("Soma de 10, 23 e 50: " + Utilidades.somar(10, 23, 50));
        System.out.println("Soma de 8.9 e 15.7: " +Utilidades.somar(8.9, 15.7));

        //7 — Crie dois métodos chamados saudacao:
        System.out.println("### Exercício 07 ###");
        Utilidades.saudacao();
        Utilidades.saudacao("Maria");

    }
    public static void mostrarBoasVindas(){
        System.out.println("Bem-vinda ao curso de Java!");
    }

}
