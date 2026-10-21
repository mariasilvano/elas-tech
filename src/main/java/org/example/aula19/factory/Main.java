package org.example.aula19.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual banco deseja utilizar? Digite:\n 1 - MySql \n 2 - MongoDB \n 3 - Oracle");
        int opcao = sc.nextInt();

        BancoDeDados banco =BancoDeDadosFactory.criar(opcao);
        conectarBanco(banco);

    }

    public static void conectarBanco(BancoDeDados bd){
        bd.chamarBanco();
        System.out.println("O número do banco de dados é: "+ bd.getNumero());
    }
}
