package org.example.atividadepadroescriacionais.atividadeadapter;

public class PayPalAdapter implements Pagamento{

    PayPalAPI payPalAPI = new PayPalAPI();

    @Override
    public void pagar() {
        payPalAPI.sendPayment();
    }
}
