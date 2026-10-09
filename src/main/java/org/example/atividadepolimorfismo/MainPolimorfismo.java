package org.example.atividadepolimorfismo;

import org.example.atividadeheranca.Aluna;
import org.example.atividadeheranca.Pessoa;
import org.example.atividadeheranca.Professora;

public class MainPolimorfismo {

    public static void main(String[] args) {

        System.out.println("### Atividade Polimorfismo ###");

        System.out.println("\n### 1. (mesma classe — muda a QUANTIDADE de parâmetros)\n" +
                "\n" +
                "   Crie a classe Calculadora com TRÊS métodos chamados calcularArea():\n" +
                "   - recebe um double (lado do quadrado)  -> lado * lado\n" +
                "   - recebe dois double (base e altura)   -> base * altura\n" +
                "   - recebe um int (raio do círculo)      -> 3.14159 * raio * raio\n" +
                "\n" +
                "   Chame os três na Main e imprima os resultados.\" ###\n");

        Calculadora calculadora = new Calculadora();

        System.out.println("Área do círculo: " + calculadora.calcularArea(10));
        System.out.println("Área do retângulo: "+ calculadora.calcularArea(10.00, 20.00));
        System.out.println("Área do quadrado: "+calculadora.calcularArea(8.0));

        System.out.println("\n### 2. (mesma classe — muda o TIPO do parâmetro)\n" +
                "\n" +
                "   Crie a classe Painel com QUATRO métodos chamados exibir, cada um\n" +
                "   recebendo um tipo diferente: String, int, boolean e double.\n" +
                "   Cada um imprime de um jeito, dizendo que tipo recebeu.\n" +
                "\n" +
                "   Chame os quatro.\n" +
                "\n" +
                "   Depois pense: por que o System.out.println() aceita texto, número,\n" +
                "   boolean e objeto, ao invés de ter um método println para cada? É exatamente isso que vocês acabaram de fazer. ###\n");

        Painel.exibir("Texto-texto-texto-texto");
        Painel.exibir(897563);
        Painel.exibir(true);
        Painel.exibir(897.563);

        System.out.println("\n### 3. Crie a classe Professora, também filha de Pessoa, com o atributo\n" +
                "   disciplina e o método lancarNota(String aluna, double nota), que\n" +
                "   imprime algo como \"Flora lançou nota 9.5 para Ana\". Use printf\n" +
                "   com %.1f. ###\n");

        Professora professora = new Professora();
        professora.nome = "Flora";
        professora.idade = 30;
        professora.disciplina = "Java e IA";

        Aluna aluna = new Aluna();
        aluna.nome = "Maria";
        aluna.idade = 25;
        aluna.curso = "Java e IA";

        professora.apresentar();
        professora.lancarNota("Maria", 8.7);

        aluna.apresentar();
        aluna.estudar();

        System.out.println("\n### 4. (herança — quem não sobrescreve)\n" +
                "\n" +
                "   Crie a classe Estagiaria, filha de Pessoa, que NÃO sobrescreve\n" +
                "   o apresentar() e não acrescenta nada.\n" +
                "\n" +
                "   Na Main, crie o objeto, dê valor aos atributos, guarde ele numa\n" +
                "   variável do tipo da mãe e chame o método apresentar().\n" +
                "\n" +
                "   O que saiu? Por quê?###\n");

        Estagiaria estagiaria = new Estagiaria();
        estagiaria.nome = "Joana";
        estagiaria.idade = 16;

        estagiaria.apresentar();//Nesse caso vai executar o método exatamente como está na superclasse

        System.out.println("\n### 5. (herança — método que recebe a mãe)\n" +
                "\n" +
                "   Crie um método na sua classe Main:\n" +
                "\n" +
                "   static void mostrarFicha(Pessoa p) {\n" +
                "       p.apresentar();\n" +
                "   }\n" +
                "\n" +
                "   Chame ele três vezes, passando a aluna, a professora e a estagiária.\n" +
                "\n" +
                "   O método não sabe quem vai receber, e funciona pros três.###\n");

                mostrarFicha(aluna);
                mostrarFicha(professora);
                mostrarFicha(estagiaria);

        System.out.println("\n### 6. (interface)\n" +
                "\n" +
                "   Crie a interface MeioDePagamento com pagar(double valor).\n" +
                "   Crie Pix e Boleto implementando ela, cada uma imprimindo uma\n" +
                "   mensagem diferente com printf e %.2f.\n" +
                "\n" +
                "   Declare UMA variável do tipo da interface:\n" +
                "\n" +
                "   MeioDePagamento forma;\n" +
                "   forma = new Pix();     forma.pagar(150.00);\n" +
                "   forma = new Boleto();  forma.pagar(150.00);.###\n");

        MeioDePagamento forma;
        forma = new Pix();     forma.pagar(150.00);
        forma = new Boleto();  forma.pagar(150.00);


        System.out.println("\n### 7. (a armadilha)\n" +
                "\n" +
                "   Na Professora, troque o apresentar() sobrescrito por este,\n" +
                "   com um parâmetro a mais e SEM o @Override:\n" +
                "\n" +
                "   void apresentar(String cargo) {\n" +
                "       System.out.println(\"Oi, sou \" + nome + \", \" + cargo);\n" +
                "   }\n" +
                "\n" +
                "   Rode o exercício 3 de novo. O que a professora imprime agora?\n" +
                "   Deu algum erro?\n" +
                "\n" +
                "   Depois coloque o @Override nesse método e veja o que o Java diz.\n" +
                "\n" +
                "   Essa questão mostra por que o @Override existe..###\n");

        System.out.println("Sem o @Override, apresentar(String) é só uma SOBRECARGA (outra assinatura), não sobrescreve nada:\n" +
                "o apresentar() da professora volta a imprimir a versão da Pessoa e o Java não dá erro nenhum.");

        System.out.println("Ao colocar o @Override a seguinte mensagem foi apresentada: \"Professora does not override or implement a method from a supertype\"");

    }

     static void mostrarFicha(Pessoa p) {
        p.apresentar();
    }
}
