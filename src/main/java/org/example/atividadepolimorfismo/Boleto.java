package org.example.atividadepolimorfismo;

public class Boleto implements MeioDePagamento{
    public void pagar(double valor) {
        System.out.printf("Forma de pagamento escolhida: Boleto, valor: %.2f\n", valor);
    }
}
