package org.example.atividadeencapsulamento;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroConta = "001-X";

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setTitular(String titular) {
        if (titular.isEmpty() || titular == null) {
            System.out.println("Titular inválido! Mantido " + this.titular);
            return;
        }else {
            this.titular = titular;
        }
    }

    public void depositar(double valor){
      if(valor <= 0 ){
          System.out.println("Valor inválido!");
          return;
      }else{
          this.saldo += valor;
          registrarLog("deposito de "+ valor);
      }
    }

    public void sacar(double valor){
        if(temSaldo(valor)){
            this.saldo -= valor;
            registrarLog("saque de "+ valor);
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }

    private boolean temSaldo(double valor){
        if(valor <= saldo){
            return true;
        }else{
            return false;
        }
    }

    private void registrarLog(String acao){
        System.out.printf("[LOG] %s: %s %n", titular, acao);
        System.out.println("Saldo: " +saldo);
    }

}

