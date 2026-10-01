package org.example.aula05;

import java.util.Scanner;

public class EstruturasDeRepeticao {
    static void main() {

    Scanner scanner = new Scanner(System.in);

    //FOR

    for (int i = 0; i<=3; i++){
        System.out.println("Exemplo de FOR: " + i);
    }

    /*WHILE
     int senha = 0;
     while(senha != 1){
         System.out.println("Digite a senha: ");
         senha = scanner.nextInt();
     }
        System.out.println("Acesso Liberado!"); */

    //DO WHILE
        int senha = 0;
        do{
            System.out.println("Digite sua senha: ");
            senha = scanner.nextInt();
        }while(senha != 3);

            System.out.println("Acesso Liberado");

    }
}
