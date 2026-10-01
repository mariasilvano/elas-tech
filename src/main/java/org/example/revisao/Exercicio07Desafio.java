package org.example.revisao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07Desafio {
    public static void main(String[] args){
        /*7 -DESAFIO — Sistema de Cadastro de Alunas
        Você vai construir um programa que cadastra alunas, calcula a média delas e diz se foram aprovadas. O programa fica rodando até a pessoa escolher sair.
        Este desafio tem regras de construção obrigatórias. Não é só fazer funcionar, é fazer funcionando do jeito pedido. Sigam as instruções solicitadas, pois objetivo é praticar as estruturas que vimos essa semana.
        O que o programa faz
        Pergunta se a pessoa quer iniciar: 1 para continuar, 2 para sair
        Se escolher 1:
        pede a primeira nota
        pede a segunda nota
        calcula a média
        pede o nome da aluna
        decide se ela foi aprovada (média 6 ou mais)
        mostra uma frase com o nome, as duas notas, a média e se foi aprovada
        volta pro menu
        Se escolher 2: mostra uma mensagem de despedida e encerra
        Se digitar qualquer outra coisa: avisa que a opção é inválida e volta pro menu
        Regras obrigatórias:
        1. Crie uma classe Aluna com cinco atributos: nome, nota, nota2, media e passou (passou sendo boolean).
        2. Toda informação fica nos atributos do objeto. Nada de criar variáveis soltas tipo double nota1 = sc.nextDouble(). O valor lido vai direto pro atributo: aluna.nota = sc.nextDouble().
        3. Use while para manter o programa rodando até a pessoa escolher sair.
        4. Use switch para tratar as opções do menu. Todos os casos precisam de break, e precisa ter um default.
        5. Instancie a Aluna dentro do loop, no momento do cadastro. Cada volta cria uma aluna nova. (Ainda não estudamos como guardar vários valores, por enquanto, cada aluna é mostrada na tela e descartada na próxima iteração do loop.)
        6. Calcule a média dentro do programa. Nada de pedir a média pronta pra pessoa.
        7. Use if / else para definir se a aluna passou. A média mínima para aprovação é 6. Se a média for 6 ou mais, passou recebe true; se for menor, recebe false. O programa decide sozinho — não pergunte isso para a pessoa.
        8. Use printf para mostrar o resultado: %s para o nome (String), %.1f para as notas e a média, e %b para o passou (boolean).
        Exemplo de execução:
        Deseja iniciar? Pressione 1 continuar, 2 para sair
        1
        Nota 1:
        8.0
        Nota 2:
        7.0
        Nome da Aluna:
        Maria Silva
        O nome da aluna é Maria Silva, sua primeira nota foi 8.0, sua segunda nota foi 7.0,
        e sua média final foi 7.5. Aluna aprovada: true
        Deseja iniciar? Pressione 1 continuar, 2 para sair
        5
        Opção inválida.
        Deseja iniciar? Pressione 1 continuar, 2 para sair
        2
        Encerrando o sistema. Até logo!
        Bônus:
        Se terminar e quiser ir além
        Faça o programa mostrar "Aprovada" ou "Reprovada" em vez de true / false,
        Adicione uma opção no menu que mostra quantas alunas já foram cadastradas até agora
        Não deixe cadastrar nota menor que 0 ou maior que 10
         */
        int opcao = 0;
        int qtdAlunasCadastradas = 0;
        Scanner sc = new Scanner(System.in);

        while(opcao != 2){
            System.out.println("Deseja iniciar? ");
            System.out.println("1 - para continuar");
            System.out.println("2 - para sair");
            System.out.println("3 - para ver a quantidade de cadastros");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    Aluna aluna = new Aluna();
                    System.out.println("Nota 1:");
                    aluna.nota = sc.nextDouble();

                    while (aluna.nota < 0 || aluna.nota > 10) {
                        System.out.println("A nota deve estar entre 0 e 10. Digite novamente:");
                        aluna.nota = sc.nextDouble();
                    }
                    System.out.println("Nota 2:");
                    aluna.nota2 = sc.nextDouble();

                    while (aluna.nota2 < 0 || aluna.nota2 > 10) {
                        System.out.println("A nota deve estar entre 0 e 10. Digite novamente:");
                        aluna.nota2 = sc.nextDouble();
                    }

                    sc.nextLine();
                    System.out.println("Nome da Aluna:");
                    aluna.nome = sc.nextLine();

                    aluna.media = ((aluna.nota + aluna.nota2)/2);

                    if(aluna.media>=6){
                        aluna.passou = true;
                    }else{
                        aluna.passou = false;
                    }

                    String status = aluna.passou ? "Aprovada" : "Reprovada";

                    System.out.printf(Locale.US, "O nome da aluna é %s, sua primeira nota foi %.1f, sua segunda nota foi %.1f,%n" +
                                    "e sua média final foi %.1f. Aluna: %s%n",
                            aluna.nome, aluna.nota, aluna.nota2, aluna.media, status);

                    qtdAlunasCadastradas++;
                    break;

                case 2:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;
                case 3:
                    System.out.println("Quantidade de alunas cadastradas:" + qtdAlunasCadastradas);
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }

    }
}
