package org.example.aula22.decorator.atividade;

public class ComGranola extends AcaiDecorator{

    public ComGranola(Acai acai){
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao() + " + Granola";
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco() + 5.00;
    }
}
