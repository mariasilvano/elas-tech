package org.example.atividadeforeach;

public class Exercicio04 {
    public static void main() {
        System.out.println("\n### 4. Com um array de nomes, use for-each e um if para contar quantos têm mais de 5 letras. Mostre o total. Dica: usem o método length.###");
        String[] nomes2 = {"Josefina", "Ana", "José", "Artemio"};
        int contador = 0;

        for (String nome : nomes2) {
            if (nome.length() > 5) {
                contador++;
            }
        }

        System.out.println(contador + " nomes tem mais de 5 letras!");

    }
}
