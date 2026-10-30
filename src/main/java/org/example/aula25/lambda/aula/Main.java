package org.example.aula25.lambda.aula;

public class Main {
    static void main() {

        //Criou o metodo em vip
        Desconto vip = valor -> valor * 0.20;

        //Agora é só chamar o metodo através de vip
        System.out.println(vip.calcularDesconto(100));
    }
}
