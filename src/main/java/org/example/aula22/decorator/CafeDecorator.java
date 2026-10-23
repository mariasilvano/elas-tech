package org.example.aula22.decorator;

abstract class CafeDecorator implements Cafe {
    //Variável do tipo da interface
    //protected as filhas conseguem acessar em outros packages
    protected  Cafe cafeEmbrulhado;

    public CafeDecorator(Cafe cafe){
        this.cafeEmbrulhado = cafe;
    }
}
