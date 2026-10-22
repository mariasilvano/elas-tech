package org.example.aula19.facade;

public class Main {
    public static void main(String[] args) {

        //SEM FACADE
        System.out.println("SEM FACADE");
        Estoque estoque = new Estoque();
        Cobranca cobranca = new Cobranca();
        NotaFiscal notaFiscal = new NotaFiscal();
        Entrega entrega = new Entrega();

        estoque.darBaixa();
        cobranca.cobrar();
        notaFiscal.emitir();
        entrega.agendar();


        //COM FACADE
        System.out.println("\n COM FACADE");
        CompraFacade compra = new CompraFacade();
        compra.finalizarCompra();

    }
}
