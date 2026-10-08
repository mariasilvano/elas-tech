package org.example.atividadeinterface;

import java.util.ArrayList;

public class MainInterface {
    public static void main(String[] args) {
        System.out.println("### Atividade Interfaces ###");


        System.out.println("\n### 1. Crie uma interface Animal com o método emitirSom().\n" +
                " Crie a classe Cachorro que implementa ela e imprime \"Au au!\".\n" +
                " Na Main, crie um cachorro e chame o método. Não esqueça do @Override. ###\n");

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();

        //2. Agora acrescente a classe Gato, que implementa a mesma interface e
        //   imprime "Miau!". Na main, declare as duas variáveis como Animal:
        //
        //   Animal bidu = new Cachorro();
        //   Animal salem= new Gato();
        //
        //   Chame emitirSom() nas duas.

        System.out.println("\n### 2. Agora acrescente a classe Gato, que implementa a mesma interface e\n" +
                "imprime \"Miau!\". Na main, declare as duas variáveis como Animal: ###\n");

        Animal bidu = new Cachorro();
        Animal salem = new Gato();

        bidu.emitirSom();
        salem.emitirSom();
        //
        //3. Crie um ArrayList<Animal>, coloque um cachorro e um gato dentro,
        //   e percorra com for-each chamando emitirSom(). Repare que não
        //   tem nenhum if. Dica:
        //
        //animais.add(new Cachorro());
        //
        //

        System.out.println("\n### 3. Crie um ArrayList<Animal>, coloque um cachorro e um gato dentro,\n" +
                " e percorra com for-each chamando emitirSom(). Repare que não\n" +
                " tem nenhum if. ###\n");

        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(bidu);
        animais.add(salem);

        for (Animal animal : animais){
            animal.emitirSom();
        }

        //4. Crie uma interface Notificacao com o método enviar(String mensagem).
        //   Crie duas classes que implementam ela: Email e SMS. Cada uma
        //   imprime de um jeito. Adicione as duas num ArrayList<Notificacao>
        //   e percorra com for-each, enviando a mesma mensagem.
        //
        //   Saída esperada:
        //   E-mail enviado: Sua compra foi aprovada!
        //   SMS enviado: Sua compra foi aprovada!
        //

        System.out.println("\n### 4 - Crie uma interface Notificacao com o método enviar(String mensagem).\n" +
                " Crie duas classes que implementam ela: Email e SMS. Cada uma\n" +
                " imprime de um jeito. Adicione as duas num ArrayList<Notificacao>\n" +
                " e percorra com for-each, enviando a mesma mensagem. ###\n");

        ArrayList<Notificacao> notificacoes = new ArrayList<>();

        notificacoes.add(new Email());
        notificacoes.add(new SMS());

        for(Notificacao notificacao : notificacoes){
            notificacao.enviar("Sua compra foi aprovada!");
        }

        //5. Crie uma interface Veiculo com DOIS métodos: ligar() e acelerar().
        //   Crie Carro e Moto implementando os dois. Coloque numa lista e
        //   percorra com for-each chamando os dois métodos em cada um.

        System.out.println("\n### 5. Crie uma interface Veiculo com DOIS métodos: ligar() e acelerar().\n" +
                " Crie Carro e Moto implementando os dois. Coloque numa lista e\n" +
                " percorra com for-each chamando os dois métodos em cada um. ###\n");


        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro());
        veiculos.add(new Moto());

        for(Veiculo veiculo : veiculos){
            veiculo.ligar();
            veiculo.acelerar();
        }

    }
}

