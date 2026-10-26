package org.example.tdd.atividadetdd;

public class CalculadoraDesconto {

    public double aplicarDesconto(double valorCompra, boolean clienteVip){
        if(valorCompra <=0 ){
            throw new IllegalArgumentException("O valor da compra deve ser maior que zero!");
        } else if (valorCompra < 100 && !clienteVip) {
            return valorCompra;
        }else if (clienteVip){
            return valorCompra * 0.90;
        }else{
            return valorCompra;
        }
    }
}
