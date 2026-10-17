package org.example.atividadesingleton;

public class AtividadeSingleton {
    public static void main(String[] args) {
        System.out.println("1. O que o padrão Singleton garante?\n" +
                "a) Que a classe tenha vários construtores\n" +
                "b) Que exista apenas um objeto da classe no programa\n" +
                "c) Que a classe não tenha atributos\n" +
                "d) Que a classe possa ser herdada");

        System.out.println("\nResposta: b) Que exista apenas um objeto da classe no programa.");

        System.out.println("\n2. Por que o construtor de um Singleton é private?");
        System.out.println("\nResposta: Para impedir que outros classes criem instâncias do Singleton com new, pois o próprio deve controlar a criação e garantir que exista uma única instância, que é acessada pelo método estático getIntancia()");

        System.out.println("3. Complete a lacuna:\n" +
                "\n" +
                "java\n" +
                "private ______ Configuracao instancia;\n" +
                "a) final\n" +
                "b) public\n" +
                "c) static\n" +
                "d) void");

        System.out.println("\nResposta: private \u001B[1mstatic\u001B[0m Configuracao instancia;");

        System.out.println("4. O que acontece se alguém tentar escrever isto fora da classe?\n" +
                "\n" +
                "java\n" +
                "Configuracao c = new Configuracao();");

        System.out.println("\nResposta: Acontece o erro: 'XXXXX' has private access in 'caminho'");


        System.out.println("5. Qual é a forma correta de obter o objeto de um Singleton chamado Configuracao?\n" +
                "a) new Configuracao()\n" +
                "b) Configuracao.getInstancia()\n" +
                "c) Configuracao.instancia\n" +
                "d) this.getInstancia()");

        System.out.println("\nResposta: b) Configuracao.getInstancia()");

        System.out.println("\n6. Crie uma classe Singleton chamada ContadorVisitas e faça dois objetos pegarem a instância dele e aumentarem o contador \n");

        ContadorVisitas pagina1 = ContadorVisitas.getInstancia();
        ContadorVisitas pagina2 = ContadorVisitas.getInstancia();

        pagina1.registrarVisita();
        System.out.println("Número de visitas após página 1 chamar: " + pagina1.getTotal());
        pagina2.registrarVisita();
        System.out.println("Número de visitas após página 2 chamar " + pagina1.getTotal());
        pagina1.registrarVisita();
        System.out.println("Número de visitas após página 1 chamar novamente: " + pagina1.getTotal());

        System.out.println();


        System.out.println("7. Crie uma classe Singleton chamada Carrinho que tem um atributo quantidadeItens e faça dois objetos pegarem a instância dele e aumentarem a quantidade de intens");

        Carrinho telaProduto = Carrinho.getInstancia();
        Carrinho telaPromocoes = Carrinho.getInstancia();

        telaProduto.adicionarItem();
        System.out.println("Tela Produto adicionar item");
        telaPromocoes.adicionarItem();
        System.out.println("Tela Promocoes adicionar item");
        telaProduto.adicionarItem();
        System.out.println("Tela Produto adicionar item");
        telaPromocoes.adicionarItem();
        System.out.println("Tela Promocoes adicionar item");

        System.out.println("Itens no carrinho: " + telaProduto.getQuantidadeItens());
    }

}
