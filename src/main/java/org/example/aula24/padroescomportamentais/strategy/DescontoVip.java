package org.example.aula24.padroescomportamentais.strategy;

public class DescontoVip implements Desconto {
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.20;
    }
}
