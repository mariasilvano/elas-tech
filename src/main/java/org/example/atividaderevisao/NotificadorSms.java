package org.example.atividaderevisao;

public class NotificadorSms implements Notificador{

    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificação via SMS: " + mensagem);
    }
}
