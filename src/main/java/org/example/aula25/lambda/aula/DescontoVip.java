package org.example.aula25.lambda.aula;

public class DescontoVip implements Desconto{

    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.20;
    }
}
