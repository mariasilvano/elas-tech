package org.example.atividadepadroescriacionais.atividadeadapter;

public class MainAdapter {
    public static void main(String[] args) {

        //Pagamento payPal = new PayPalAPI();
        //payPal.sendPayment();

        Pagamento pagamentoPayPal = new PayPalAdapter();
        pagamentoPayPal.pagar();

    }
}
