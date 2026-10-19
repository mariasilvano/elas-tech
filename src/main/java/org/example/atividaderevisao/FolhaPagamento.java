package org.example.atividaderevisao;

public class FolhaPagamento {
    private Notificador notificador;

    public FolhaPagamento(Notificador notificador) {
        this.notificador = notificador;
    }

    public void pagar(Funcionario f){
        notificador.notificar("Olá, " + f.getNome()+ "! Seu salário de R$ " + String.format("%.2f", f.calcularSalario()) + " foi pago.");
    }

}
