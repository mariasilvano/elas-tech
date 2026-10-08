package org.example.atividadeforeach;

public class Exercicio03 {
    public static void main() {
        System.out.println("\n### 3. Com o array de notas {8, 6, 10, 7}, use for-each para somar todas e mostrar a soma e a média.###");

        double[] notas2 = {8, 6, 10, 7};
        double soma = 0;

        for (double nota : notas2){
            soma+= nota;
        }

        System.out.printf("Soma das notas: %.2f%n", soma);
        System.out.printf("Média das notas: %.2f%n", (soma/ notas2.length));

    }
}
