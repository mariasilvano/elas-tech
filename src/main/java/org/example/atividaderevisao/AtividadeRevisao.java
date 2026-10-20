package org.example.atividaderevisao;

public class AtividadeRevisao {
    public static void main(String[] args) {

        System.out.println("\nQuestão 3: Getters e Setters");
        Produto produto = new Produto();

        produto.setNome("Meu produto");
        produto.setPreco(100);
        produto.setQuantidade(10);

        System.out.println("Produto: "+ produto.getNome());
        System.out.println("Preço: "+ produto.getPreco());
        System.out.println("Quantidade: "+ produto.getQuantidade());

        produto.setPreco(-50);
        produto.setQuantidade(-5);

        System.out.println("Preço após tentativa inválida: " + produto.getPreco());
        System.out.println("Quantidade após tentativa inválida: " + produto.getQuantidade());

        System.out.println("\nQuestão 5: Classe abstrata");
        Retangulo retangulo = new Retangulo("Retângulo", 20, 12);
        retangulo.exibirNome();
        System.out.println("Área: " + retangulo.calcularArea());

        //'Forma' is abstract; cannot be instantiated
        //Forma f = new Forma("teste");

        System.out.println("\nQuestão 6: Exercício integrado (Sistema de Funcionários)");
        Gerente gerente = new Gerente("Ademir", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Maria", 2000);

        FolhaPagamento folhaPagamento1 = new FolhaPagamento(new NotificadorEmail());
        folhaPagamento1.pagar(gerente);
        folhaPagamento1.pagar(desenvolvedor);

        FolhaPagamento folhaPagamento2 = new FolhaPagamento(new NotificadorSms());
        folhaPagamento2.pagar(gerente);
        folhaPagamento2.pagar(desenvolvedor);


        Brinquedo brinquedo01 = new Brinquedo("Boneca");

        brinquedo01.verBrinquedo(brinquedo01);


    }
}
