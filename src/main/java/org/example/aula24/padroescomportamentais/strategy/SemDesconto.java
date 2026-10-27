package org.example.aula24.padroescomportamentais.strategy;

public class SemDesconto implements Desconto {
    @Override
    public double calcularDesconto(double valor) {

        return 0;
    }
}