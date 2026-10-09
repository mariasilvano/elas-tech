package org.example.atividadeheranca;

public class Gerente extends Funcionario implements Notificavel, Exportavel {

    void aprovarFerias(String quem){
        System.out.println("Aprovando as férias de: " +quem);
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificação para " + nome + ": " + mensagem);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando dados do gerente " + nome + "...");
    }
}
