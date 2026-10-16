package org.example.petshop;

import java.util.*;

public class Petshop {

    private final Scanner sc = new Scanner(System.in);
    private final CadastroPets cadastro;
    private final FilaBanho filaBanho;
    private final List<Servico> servicos;

    public Petshop(CadastroPets cadastro, FilaBanho filaBanho, List<Servico> servicos) {
        this.cadastro = cadastro;
        this.filaBanho = filaBanho;
        this.servicos = servicos;
    }

    public static void main(String[] args) {
        List<Servico> servicos = new ArrayList<>();
        servicos.add(new Banho());
        servicos.add(new Tosa());
        servicos.add(new Consulta());

        Petshop app = new Petshop(new CadastroPets(), new FilaBanho(), servicos);
        app.executar();
    }

    public void executar() {
        int opcao = -1;

        while (opcao != 0) {
            exibirMenu();

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        cadastrarPet();
                        break;
                    case 2:
                        listarPets();
                        break;
                    case 3:
                        buscarPet();
                        break;
                    case 4:
                        mostrarEspecies();
                        break;
                    case 5:
                        entrarNaFila();
                        break;
                    case 6:
                        atenderProximo();
                        break;
                    case 7:
                        pacoteServicos();
                        break;
                    case 0:
                        sc.close();
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Digite apenas números!");
                sc.nextLine();
            }
        }

        if (!cadastro.estaVazio()) {
            mostrarInformacao(cadastro.primeiro());
            System.out.println("---");
            mostrarInformacao(cadastro.primeiro(), "=== FICHA DO PET ===");
        }
    }

    private void exibirMenu() {
        System.out.println("\n=== PETSHOP ===");
        System.out.println("1 - Cadastrar pet");
        System.out.println("2 - Listar pets");
        System.out.println("3 - Buscar pet");
        System.out.println("4 - Mostrar espécies cadastradas");
        System.out.println("5 - Entra na fila de banho");
        System.out.println("6 - Atender o próximo");
        System.out.println("7 - Pacote completo de serviços");
        System.out.println("0 - Sair");
    }

    private void cadastrarPet() {
        System.out.println("Digite o nome do pet: ");
        String nome = sc.nextLine();

        System.out.println("Digite a espécie do pet: ");
        String especie = sc.nextLine();

        System.out.println("Digite o peso do pet: ");
        double peso = sc.nextDouble();
        sc.nextLine();

        cadastro.adicionar(criarPet(especie, nome, peso));
        System.out.println("Pet cadastrado! Agora são " + cadastro.total() + " (pets).");
    }

    private Pet criarPet(String especie, String nome, double peso) {
        if (especie.equalsIgnoreCase("cachorro")) {
            return new Cachorro(nome, especie, peso);
        } else if (especie.equalsIgnoreCase("gato")) {
            return new Gato(nome, especie, peso);
        } else {
            return new OutroPet(nome, especie, peso);
        }
    }

    private void listarPets() {
        if (cadastro.estaVazio()) {
            System.out.println("Nenhum pet cadastrado.");
            return;
        }

        System.out.println("--- PETS CADASTRADOS ---");
        for (Pet p : cadastro.listar()) {
            System.out.printf("%s (%s) - %.1f kg - Porte %s %n",
                    p.getNome(), p.getEspecie(), p.getPeso(), p.getPorte());
            System.out.println(p.emitirSom());
        }
        System.out.println();
    }

    private void buscarPet() {
        System.out.println("Qual pet você procura?");
        String buscar = sc.nextLine();

        ArrayList<Pet> encontrados = cadastro.buscarPorNome(buscar);

        for (Pet p : encontrados) {
            System.out.printf("Encontrado: %s (%s) - %.1f kg - Porte %s %n",
                    p.getNome(), p.getEspecie(), p.getPeso(), p.getPorte());
        }
        System.out.println();

        if (encontrados.isEmpty()) {
            System.out.println("Pet não encontrado.");
        }
    }

    private void mostrarEspecies() {
        HashSet<String> especies = cadastro.especies();

        System.out.println("--- ESPÉCIES CADASTRADAS ---");
        especies.forEach(System.out::println);
        System.out.println("Total de espécies diferentes: " + especies.size());
    }

    private void entrarNaFila() {
        System.out.println("Nome do pet para entrar na fila:");
        String nomePet = sc.nextLine();

        filaBanho.entrar(nomePet);
        System.out.println(nomePet + " entrou na fila de banho.");
        System.out.println("Fila agora:" + filaBanho);
    }

    private void atenderProximo() {
        if (filaBanho.estaVazia()) {
            System.out.println("Não há pets na fila.");
            return;
        }

        System.out.println("Próximo da fila: " + filaBanho.proximo());
        System.out.println("Atendendo agora: " + filaBanho.atender());
        System.out.println("Fila atual: " + filaBanho);
    }

    private void pacoteServicos() {
        System.out.println("Nome do pet:");
        String nomePet = sc.nextLine();

        for (Servico servico : servicos) {
            servico.executar(nomePet);
        }
    }

    public static void mostrarInformacao(Pet pet) {
        System.out.println("Nome: " + pet.getNome());
    }

    public static void mostrarInformacao(Pet pet, String titulo) {
        System.out.println(titulo);
        System.out.println("Nome: " + pet.getNome());
        System.out.println("Espécie: " + pet.getEspecie());
        System.out.println("Peso: " + pet.getPeso() + " kg");
        System.out.println("Porte: " + pet.getPorte());
    }
}