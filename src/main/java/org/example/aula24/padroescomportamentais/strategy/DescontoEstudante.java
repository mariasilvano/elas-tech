package org.example.aula24.padroescomportamentais.strategy;

public class DescontoEstudante implements Desconto {
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.10;
    }

}
