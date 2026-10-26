package org.example.aula24.padroescomportamentais.observer;

public class Seguidor implements Inscrito {
    String nome;

    public Seguidor(String nome){
        this.nome = nome;
    }

    @Override
    public void receberNotificacao(String mensagem) {
        System.out.println(" [" + nome +"] recebeu notificação: " + mensagem);
    }
}
