package org.example.aula22.decorator;

public class ComCanela extends CafeDecorator{
    public ComCanela(Cafe cafe){
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafeEmbrulhado.getDescricao() + " + Canela";
    }

    @Override
    public double getPreco() {
        return cafeEmbrulhado.getPreco() + 0.50;
    }
}
