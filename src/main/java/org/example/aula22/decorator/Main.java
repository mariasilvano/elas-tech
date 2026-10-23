package org.example.aula22.decorator;

public class Main {
    public static void main(String[] args){

        Cafe pedido1 = new CafeSimples();
        System.out.println(pedido1.getDescricao()+ " = R$ "+ pedido1.getPreco());

        Cafe pedido2 = new ComLeite(new CafeSimples());
        System.out.println(pedido2.getDescricao()+ " = R$ "+ pedido2.getPreco());

        Cafe pedido3 = new ComChocolate(new ComLeite(new CafeSimples()));
        System.out.println(pedido3.getDescricao()+ " = R$ "+ pedido3.getPreco());

        Cafe pedido4 = new ComLeite(new ComChocolate(new CafeSimples()));
        System.out.println(pedido4.getDescricao()+ " = R$ "+ pedido4.getPreco());

        Cafe pedido5 = new ComCanela(new ComLeite(new CafeSimples()));
        System.out.println(pedido5.getDescricao()+ " = R$ "+ pedido5.getPreco());
    }
}
