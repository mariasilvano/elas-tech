package org.example.atividadeencapsulamento;

public class AtividadeEncapsulamento {
    public static void main(String[] args) {

        ContaBancaria c = new ContaBancaria();

        c.setTitular("");
        c.setTitular("Ana");
        System.out.println(c.getTitular());
        c.depositar(500.0);
        c.depositar(-100);
        c.sacar(2000);
        c.sacar(200);
        //c.registrarLog("teste");

        System.out.println("");

        //java: titular has private access in org.example.atividadeencapsulamento.ContaBancaria
        //java: saldo has private access in org.example.atividadeencapsulamento.ContaBancaria

        Produto p = new Produto();

        System.out.println(p.nome);
        System.out.println(p.preco);
       //System.out.println(p.codigoInterno);
        System.out.println("");

        System.out.println("Número da conta: " +c.getNumeroConta());
        //c.setNumeroConta("999-Z");
    }
}
