package org.example.atividadeheranca;

public class MainHeranca {
    public static void main(String[] args){

        System.out.println("### Atividade Heranca ###");

        System.out.println("\n### 1. Crie a classe Pessoa com os atributos nome e idade, e o método\n" +
                "   apresentar(), que imprime \"Oi, sou [nome] e tenho [idade] anos.\" ###");

        System.out.println();
        Aluna aluna = new Aluna();

        aluna.nome = "Maria";
        aluna.idade = 25;

        aluna.apresentar();

        System.out.println("\n### 2. Acrescente na Aluna o atributo curso e o método estudar(), que\n" +
                "   imprime \"[nome] está estudando [curso].\" ###\n");

        aluna.curso = "Java";

        aluna.apresentar();
        aluna.estudar();

        System.out.println("\n### 3. Crie a classe Professora, também filha de Pessoa, com o atributo\n" +
                "   disciplina e o método lancarNota(String aluna, double nota), que\n" +
                "   imprime algo como \"Flora lançou nota 9.5 para Ana\". Use printf\n" +
                "   com %.1f. ###\n");

        Professora professora = new Professora();

        professora.nome = "Katiane";
        professora.idade = 45;
        professora.disciplina = "POO";

        aluna.apresentar();
        aluna.estudar();
        professora.lancarNota("Maria", 10);

        System.out.println("\n### 4. Na Professora, sobrescreva o apresentar() usando @Override, pra\n" +
                "   imprimir \"Oi, sou [nome] e ensino [disciplina].\"###\n");

        aluna.apresentar();
        professora.apresentar();

        System.out.println("\n### 5. Faça uma cadeia de três níveis:\n" +
                "   - Funcionario, com o atributo nome e o método baterPonto()\n" +
                "   - Gerente extends Funcionario, com aprovarFerias(String quem)\n" +
                "   - Diretora extends Gerente, com definirMeta(String meta) ###\n");

        Diretora carla = new Diretora();

        carla.nome = "Carla";

        carla.baterPonto();
        carla.definirMeta("500000");
        carla.aprovarFerias("Ana");

        System.out.println("\n### 6. Crie duas interfaces:\n" +
                "   - Notificavel, com notificar(String mensagem)\n" +
                "   - Exportavel, com exportar()###\n");

        Gerente rodolfo = new Gerente();

        rodolfo.nome = "Rodolfo";

        rodolfo.baterPonto();
        rodolfo.aprovarFerias("Carla");
        rodolfo.notificar(" aprovar solicitações de férias.");
        rodolfo.exportar();

        //Class cannot extend multiple classes
    }
}
