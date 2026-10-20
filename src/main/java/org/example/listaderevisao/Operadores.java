package org.example.listaderevisao;

public class Operadores {
    public static void main(String[] args){

        System.out.println("### Operadores ###");
        System.out.println("### 1 -Crie a = 15 e b = 4. Imprima a soma, a subtração, a multiplicação, a divisão e o resto. ###");
        double a=15, b = 4;
        System.out.println("Soma: " + (a+b));
        System.out.println("Subtração: " + (a-b));
        System.out.println("Multiplicação: " + (a*b));
        System.out.println("Divisão: " + (a/b));
        System.out.println("Resto da divisão: " + (a%b));

        System.out.println("\n### 2 -Crie saldo = 1000. Use += para somar 250 e -= para tirar 380. Imprima o saldo final. ###");
        double saldo = 1000;

        System.out.println("Somando 250: "+ (saldo +=250));
        System.out.println("Tirando 380: "+ (saldo -=380));
        System.out.println("Saldo final: " + saldo);

        System.out.println("\n### 3 -Crie a = 10 e b = 10. Imprima o resultado de a == b, a != b, a > b e a >= b. ###");
         a = 10;
         b =10;

        System.out.println("a == b: " + (a==b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + ( a > b));
        System.out.println("a >= b: " + ( a >= b));


        System.out.println("\n### 4 -Crie idade = 20 e temCarteira = true. Imprima o resultado de idade >= 18 && temCarteira. ###");
        int idade = 20;
        boolean temCarteira = true;
        System.out.println("Resultado de idade >= 18 && temCarteira: " + (idade >= 18 && temCarteira));

        System.out.println("\n### 5 -Crie um número e imprima o resto da divisão dele por 2. ###");
        int numero = 77;
        System.out.println("Resto da divisão de " + numero +" por 2: " + (numero%2));

        System.out.println("\n### 6 -Calcule e imprima o total de uma compra: 3 pacotes de arroz a R$ 5.50 cada. ###");

        System.out.println("Total da Compra: ");
        System.out.println("3 un X R$5.50 cada = R$ " + (3*5.50));


        System.out.println("\n### \uD83D\uDD25 Mini-desafio — Crie uma variável com um número qualquer e, sem usar if, imprima true ou false para a pergunta: esse número é divisível por 3 e por 5 ao mesmo tempo? ###");

        int numeroQualquer = 50;
        System.out.println("Esse número(" + numeroQualquer +") é divisível por 3 e por 5 ao mesmo tempo? " + (numeroQualquer%3 == 0 && numeroQualquer%5==0));

    }
}
