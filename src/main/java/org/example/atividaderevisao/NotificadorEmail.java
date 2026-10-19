package org.example.atividaderevisao;

public class NotificadorEmail implements Notificador{

    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificação via E-mail: " + mensagem);
    }
}
