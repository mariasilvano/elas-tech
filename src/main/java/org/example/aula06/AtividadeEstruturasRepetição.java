package org.example.aula06;

public class AtividadeEstruturasRepetição {
    public static void main(String[] args){
        //1 - Mostre os números de 1 a 30, um por linha, usando for.
        System.out.println("### Exercício 1 ###");
        for(int i = 1; i<=30; i++){
            System.out.println("número: " +i);
        }

        //2 - Mostre a contagem regressiva de 10 até 1 e depois a palavra "Fim!".
        System.out.println("### Exercício 2 ###");
        for(int i = 10; i>=1; i--){
            System.out.println("número: " +i);
        }
        System.out.println("Fim!");

        //3 - Faça o mesmo do exercício 1, agora usando while. Compare os dois códigos.
        System.out.println("### Exercício 3 ###");

        int i=1;

        while(i<=30){
            System.out.println("número: " +i);
            i++;

        }

        /* Comparação: o for e o while produzem o mesmo resultado.
         No for, inicialização, condição e incremento ficam na mesma linha,
         o que é melhor quando sei quantas repetições farei.
         No while, a inicialização fica antes do laço e o incremento dentro dele,
         o que é melhor quando a repetição depende de uma condição.
        */

        //4 - Crie uma variável com um número e mostre a tabuada dele de 1 a 10.
        System.out.println("### Exercício 4 ###");

        int multiplicando = 9;

        System.out.println("Tabuada do: "+ multiplicando);
        for(int tab = 1; tab<=10; tab++){
            System.out.println(multiplicando +" X "+ tab +" = " + (multiplicando*tab));
        }
    }

}
