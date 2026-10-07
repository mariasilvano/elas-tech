package org.example.aula11;

import java.util.HashMap;

public class AtividadeHashMap {
    public static void main(String[] args) {
        /*..put("Ana", 28);
        .get("Ana");
        .getOrDefault("Zoe", 0);
        .containsKey("Ana");
        .containsValue(28);
        .remove("Ana");
        .size();
        .isEmpty();
        .keySet();
        .values();
        putAll(Map.of())
        */

        System.out.println("### Atividade AtividadeHashMap ###");

        System.out.println("\n### 1. Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa\n" +
                "   inteiro e depois use get para mostrar a idade de uma delas. ###\n");

        HashMap<String, Integer> cadastro = new HashMap<>();

        cadastro.put("José", 68);
        cadastro.put("Vitória", 45);
        cadastro.put("Paulo", 23);

        System.out.println(cadastro);

        System.out.println("Paulo tem " + cadastro.get("Paulo") + " anos.");

        System.out.println("\n### 2. Crie um HashMap de produtos e preços. Coloque \"café\" com valor 5.00,\n" +
                "   imprima, e depois faça put de \"café\" DE NOVO com valor 7.50.\n" +
                "   Imprima outra vez e veja o que aconteceu com o tamanho. ###\n");

        HashMap<String, Double> produtos = new HashMap<>();

        produtos.put("café", 5.00);
        System.out.println("Mapa: "+ produtos);
        System.out.println("Tamanho do mapa: " + produtos.size());

        produtos.put("café", 7.50);
        System.out.println("Mapa: "+ produtos);
        System.out.println("Tamanho do mapa: " + produtos.size());

        //Nesse caso o preço do produto "café" foi atualizado, por isso que o tamanho não se altera.

        System.out.println("\n### 3. Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey\n" +
                "   dentro de um if para mostrar o telefone de alguém que está na agenda\n" +
                "   e de alguém que não está. ###\n");

        HashMap<String, String> agenda = new HashMap<>();

        agenda.put("Arilson", "469875897");
        agenda.put("Edson", "46987823641");

        if(agenda.containsKey("Arilson")){
            System.out.println("Telefone de Arilson: " + agenda.get("Arilson"));
        }else {
            System.out.println("Arilson não está na agenda.");
        }

        if (agenda.containsKey("Ana")) {
            System.out.println("Telefone de Ana: " + agenda.get("Ana"));
        } else {
            System.out.println("Ana não está na agenda.");
        }

        System.out.println("\n### 4. Crie um HashMap de estoque (produto -> quantidade) com dois itens.\n" +
                "   Use getOrDefault para mostrar a quantidade de um produto que existe\n" +
                "   e de um que não existe (devolvendo 0). Depois tente com get normal\n" +
                "   no que não existe e compare. ###\n");

        HashMap<String, Integer> estoque = new HashMap<>();

        estoque.put("Café", 100);
        estoque.put("Bolo", 6);

        System.out.println("Produto que existe com getOrDefault: "+estoque.getOrDefault("Café", 0));
        System.out.println("Produto que não existe com getOrDefault(Default 0): "+estoque.getOrDefault("Leite", 0));

        System.out.println("Produto que não existe com get normal: "+estoque.get("Leite"));

        System.out.println("\n### 5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho.\n" +
                "   Remova uma delas e imprima de novo. ###\n");

        HashMap<String, Double> notas = new HashMap<>();

        notas.put("Ana", 7.0);
        notas.put( "Maria", 9.9);
        notas.put("Júlia", 9.0);

        System.out.println("Mapa: " + notas);
        System.out.println("Tamanho do mapa: " + notas.size());

        notas.remove("Ana");

        System.out.println("Mapa: " + notas);
        System.out.println("Tamanho do mapa: " + notas.size());
    }
}
