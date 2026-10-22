package org.example.aula19.facade;

public class CompraFacade {

    private Estoque estoque = new Estoque();
    private Cobranca cobranca = new Cobranca();
    private Entrega entrega = new Entrega();
    private NotaFiscal notaFiscal = new NotaFiscal();

    public void finalizarCompra(){
        estoque.darBaixa();
        cobranca.cobrar();
        entrega.agendar();
        notaFiscal.emitir();
    }
}
