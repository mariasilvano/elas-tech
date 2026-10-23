package org.example.aula22.decorator.atividade;

public class Main {
    public static void main(String[] args){

        Acai pedido01 = new ComGranola(new AcaiSimples());
        System.out.println(pedido01.getDescricao() + " = R$ " + pedido01.getPreco());

        Acai pedido02 = new ComMorango(new ComGranola(new AcaiSimples()));
        System.out.println(pedido02.getDescricao() + " = R$ " + pedido02.getPreco());
    }
}
