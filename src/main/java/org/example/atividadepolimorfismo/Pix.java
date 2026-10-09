package org.example.atividadepolimorfismo;

public class Pix implements MeioDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.printf("Forma de pagamento escolhida: Pix, valor: %.2f\n", valor);
    }
}
