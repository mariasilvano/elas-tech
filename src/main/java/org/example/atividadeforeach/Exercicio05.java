package org.example.atividadeforeach;

public class Exercicio05 {
    public static void main() {
        System.out.println("\n### 5. Pegue o exercício 1 e escreva ele DE NOVO com o for normal, usando o índice. Deixe os dois na mesma classe e compare.###");


        String[] nomesFor = {"Ana", "Maria", "José","João"};


        for (int i = 0; i < nomesFor.length; i++){
            System.out.println(nomesFor[i]);
        }
        //O for tradicional dá acesso ao índice, então você pode saber a posição do elemento, percorrer só parte do array, ir de trás para frente ou modificar elementos (nomes[i] = ...). O for-each é mais simples e menos propenso a erro (não tem risco de errar o limite do loop), mas só entrega o valor de cada elemento, sem a posição.
    }
}
