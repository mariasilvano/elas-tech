package org.example.aula11;

import java.util.ArrayDeque;
import java.util.List;

public class AtividadeArrayDeque {
    public static void main(String[] args) {
        /*
        .add("Ana");
        .peek();
        .poll();
        .isEmpty();
        .size();
        .contains("Bia");
        .addAll(List.of("Ana","Bia"));
        */


        System.out.println("### Atividade ArrayDeque ###");

        System.out.println("\n### 1. Crie uma fila e coloque três pessoas nela com add. Imprima a fila\n" +
                "   e quantas pessoas tem. ###\n");

        ArrayDeque<String> fila = new ArrayDeque<>();

        fila.add("Pedro");
        fila.add("Otavio");
        fila.add("Breno");

        System.out.println("Fila: " + fila);
        System.out.println("Tamanho da fila: " + fila.size());

        System.out.println("\n### 2. Crie uma fila com addAll. Use peek para mostrar quem é o próximo e\n" +
                "   imprima a fila logo depois. Repare que ela não mudou. ###\n");

        ArrayDeque<String> fila2 = new ArrayDeque<>();

        fila2.addAll(List.of("Ana", "João", "Maria","Edu","Joca"));

        System.out.println(fila2);
        System.out.println("Próximo: " + fila2.peek());
        System.out.println(fila2);

        System.out.println("\n### 3. Mesma fila. Agora use poll para atender o primeiro e imprima a fila\n" +
                "   depois. Compare com o exercício 2. ###\n");

        System.out.println("Atendido: " + fila2.poll());
        System.out.println("Fila agora: " + fila2);

        System.out.println("\n### 4. Crie uma fila com três nomes e atenda todos usando\n" +
                "   while (!fila.isEmpty()). No final, imprima \"Fila vazia!\". ###\n");

        ArrayDeque<String> filaNomes = new ArrayDeque<>(List.of("Catarina", "Rebeca", "Lurdes"));

        System.out.println(filaNomes + "\n");

        while(!filaNomes.isEmpty()){

            System.out.println(filaNomes.poll());
        }
        System.out.println("\nFila vazia!");

        System.out.println("\n### 5. Crie uma fila com três nomes e use contains para responder duas\n" +
                "   perguntas: se \"Bia\" está na fila e se \"Zoe\" está. ###\n");

        ArrayDeque<String> filaNomes2 = new ArrayDeque<>(List.of("Zoe", "Beatriz", "Ananda"));

        System.out.println("Bia está na fila? " + filaNomes2.contains("Bia"));
        System.out.println("Zoe está na fila? " + filaNomes2.contains("Zoe"));

        System.out.println("\n### 6. Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():\n" +
                "   - se estiver vazia  -> \"Não tem ninguém na fila.\"\n" +
                "   - se tiver gente    -> \"Próximo: [nome]\"\n" +
                "   Depois adicione uma pessoa e teste de novo. ###\n");

        ArrayDeque<String> filaVazia  = new ArrayDeque<>();

        if(filaVazia.isEmpty()) {
            System.out.println("Não tem ninguém, na fila");
        }else {
            System.out.println("Próximo: " + filaVazia.peek());
        }

        filaVazia.add("Joana");

        if(filaVazia.isEmpty()) {
            System.out.println("Não tem ninguém na fila");
        }else {
            System.out.println("Próximo: " + filaVazia.peek());
        }

    }
}
