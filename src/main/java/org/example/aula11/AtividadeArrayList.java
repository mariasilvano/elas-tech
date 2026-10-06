package org.example.aula11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtividadeArrayList {
    public static void main(String[] args) {

        System.out.println("### Atividade ArrayList ###\n");

        System.out.println("### 1 -Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.  ###");

        ArrayList<String> lista = new ArrayList<>();
        lista.addAll(List.of("Ana", "José", "Maria"));
        System.out.println(lista);

        System.out.println("\n### 2 -Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.  ###");
        ArrayList<String> frutas = new ArrayList<>(List.of("Maçã", "Banana", "Melancia","Figo"));
        System.out.println(frutas.get(0));
        System.out.println(frutas.get(3));
        System.out.println(frutas.size());

        System.out.println("\n### 3 -Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.  ###");
        ArrayList<String> pessoas = new ArrayList<>(List.of("João", "Paulo", "Pedro","Salomão"));
        System.out.println(pessoas);
        pessoas.set(2, "Bartolomeu");
        System.out.println(pessoas);


        System.out.println("\n### 4 -Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.  ###");
        ArrayList<String> cidades = new ArrayList<>(List.of("São Paulo", "Rio de Janeiro","Florianópolis", "Curitiba"));

        cidades.remove(1);
        System.out.println(cidades.size());

        System.out.println("\n### 5 -Crie uma lista com seis nomes e imprima todos usando um laço, no formato `\"0: Ana\"`. (Dica: i + \": \" + comando para pegar posição da lista)  ###");
        ArrayList<String> nomes = new ArrayList<>(List.of("João", "Paulo", "Pedro","Salomão", "Bartolomeu", "Theo"));
        for(int i = 0; i< nomes.size(); i++){
            System.out.println(i+ ": "+nomes.get(i));
        }

        System.out.println("\n### 6 -Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição. Se não estiver, avise. ###");
        ArrayList<String> nomes2 = new ArrayList<>(List.of("João", "Paulo", "Pedro", "Bartolomeu", "Theo"));
        String nome;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome para procurar na lista: ");
        nome = sc.nextLine();
        if (nomes2.contains(nome)){
            System.out.println("Lista contém o nome "+nome+ " na posição "+ nomes2.indexOf(nome));
        }else{
            System.out.println("Nome não está na lista :c");
        }
    }
}
