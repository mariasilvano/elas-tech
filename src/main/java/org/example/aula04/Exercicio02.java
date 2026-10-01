package org.example.aula04;

public class Exercicio02 {

    public static void main(String[] args) {
          /*Estruturas de Decisão:
            2 — Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00). Se o saldo for suficiente,
            mostre "Compra aprovada!" e o saldo restante. Se não for, mostre "Saldo insuficiente" e quanto está faltando.
           */

        double saldo, compra;

        System.out.println("Exercício 2 - Estrutura de Decisão:");
        System.out.println("------------------------------------------");

        //Saldo suficiente
        saldo = 500;
        compra = 320;

        System.out.println("Saldo Suficiente:");
        System.out.println("------------------------------------------");
        comprar(saldo, compra);

        //Saldo Insuficiente
        saldo = 550;
        compra = 980;

        System.out.println("------------------------------------------");
        System.out.println("Saldo Insuficiente:");
        System.out.println("------------------------------------------");
        comprar(saldo, compra);

    }

    public static void comprar(double valorSaldo, double valorCompra){

        if(valorSaldo >= valorCompra) {
            System.out.println("Saldo:" + valorSaldo);
            System.out.println("Valor da compra:" + valorCompra);
            System.out.println("Compra aprovada!");
            System.out.println("Saldo restante:" +(valorSaldo - valorCompra));
            return;
        }else{
            System.out.println("Saldo:" + valorSaldo);
            System.out.println("Valor da compra:" + valorCompra);
            System.out.println("Saldo insuficiente");
            System.out.println("Faltam:" +(valorCompra - valorSaldo));
            return;
        }
    }
}

