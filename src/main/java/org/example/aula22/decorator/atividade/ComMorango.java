package org.example.aula22.decorator.atividade;

public class ComMorango extends AcaiDecorator{

    public ComMorango(Acai acai){
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao() + " + Morango";
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco() + 5.00;
    }
}
