package org.example.aula11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AtividadeHashSet {
    public static void main(String[] args) {
        /*
        .add("Ana");
        .contains("Ana");
        .remove("Ana");
        .size();
        .isEmpty();
        .clear();
        new HashSet<>(lista);
        .addAll(List.of("Ana", "Bia", "Carla"));
        */

        System.out.println("### Atividade HashSet ###");

        System.out.println("\n### 1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles\n" +
                "   repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu\n" +
                "   com o repetido.  ###\n");

        HashSet<String> nomesSet = new HashSet<>();

        nomesSet.add("Carol");
        nomesSet.add("Maria");
        nomesSet.add("Kati");
        nomesSet.add("Maria");

        System.out.println(nomesSet);
        System.out.println(nomesSet.size());

        //Aparentemente o HashSet não permite valores duplicados, portanto um dos valores foi ignorado.


        System.out.println("\n### 2. Crie um HashSet de cores usando addAll. Depois use contains dentro\n" +
                "   de um if para avisar se a cor \"verde\" já está no conjunto ou não.  ###\n");

        HashSet<String> coresSet = new HashSet<>();

        coresSet.addAll(List.of("preto", "verde", "azul","cinza", "rosa"));
        System.out.println(coresSet);

        if(coresSet.contains("verde")){
            System.out.println("A cor verde já está no conjunto de cores.");
        }else{
            System.out.println("A cor verde não está no conjunto de cores.");
        }

        System.out.println("\n### 3. Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para\n" +
                "   tirar os repetidos. Imprima os dois e compare. ###\n");

        ArrayList<String> lista = new ArrayList<>();

        lista.addAll(List.of("João", "Ana", "Maria","João", "Ana", "Maria"));

        System.out.println(lista);

        HashSet<String> semRepetidosSet = new HashSet<>(lista);

        System.out.println(semRepetidosSet);

        System.out.println("\n### 4. Crie um HashSet com três CPFs e imprima. Depois remova um deles e\n" +
                "   imprima de novo, junto com o tamanho. ###\n");

        HashSet<String> cpfSet = new HashSet<>();

        cpfSet.addAll(List.of("394.719.050-60", "722.245.370-93", "568.332.150-65"));

        System.out.println(cpfSet);
        System.out.println(cpfSet.size());

        cpfSet.remove("722.245.370-93");

        System.out.println(cpfSet);

        System.out.println("\n### 5. Crie um HashSet com três frutas e percorra ele com for,\n" +
                "   imprimindo uma por linha. ###\n");

        HashSet<String> frutas = new HashSet<>();
        frutas.addAll(List.of("Morango", "Melancia", "Kiwi"));

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        System.out.println("\n### 6. Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e\n" +
                "   imprima o isEmpty() de novo. ###\n");

        HashSet<Integer> vazioSet = new HashSet<>();

        System.out.println("O conjunto está vazio? " + vazioSet.isEmpty());

        vazioSet.add(100);

        System.out.println("O conjunto está vazio? " + vazioSet.isEmpty());

    }
}
