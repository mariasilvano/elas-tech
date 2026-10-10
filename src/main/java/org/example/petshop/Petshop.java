package org.example.petshop;

import java.util.*;

public class Petshop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        ArrayList<Pet> pets = new ArrayList<>();
        Queue<String> filaBanho = new ArrayDeque<>();
        ArrayList<Servico> servicos = new ArrayList<>();

        Servico banho = new Banho();
        Servico tosa = new Tosa();
        Servico consulta = new Consulta();
        servicos.add(banho);
        servicos.add(tosa);
        servicos.add(consulta);

        while(opcao != 0){
            System.out.println("\n=== PETSHOP ===");
            System.out.println("1 - Cadastrar pet");
            System.out.println("2 - Listar pets");
            System.out.println("3 - Buscar pet");
            System.out.println("4 - Mostrar espécies cadastradas");
            System.out.println("5 - Entra na fila de banho");
            System.out.println("6 - Atender o próximo");
            System.out.println("7 - Pacote completo de serviços");
            System.out.println("0 - Sair");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch(opcao){
                    case 1:

                        System.out.println("Digite o nome do pet: ");
                        String nome  = sc.nextLine();

                        System.out.println("Digite a espécie do pet: ");
                        String especie = sc.nextLine();

                        System.out.println("Digite o peso do pet: ");
                        double peso = sc.nextDouble();
                        sc.nextLine();

                        Pet pet;

                        if (especie.equalsIgnoreCase("cachorro")) {
                            pet = new Cachorro();
                        } else if (especie.equalsIgnoreCase("gato")) {
                            pet = new Gato();
                        } else {
                            pet = new Pet();
                        }

                        pet.nome = nome;
                        pet.especie = especie;
                        pet.peso = peso;

                        pet.definirPorte();
                        pets.add(pet);

                        System.out.println("Pet cadastrado! Agora são "+ pets.size() +" (pets).");

                        break;

                    case 2:
                        if(pets.isEmpty()){
                            System.out.println("Nenhum pet cadastrado.");
                        }else {

                            System.out.println("--- PETS CADASTRADOS ---");

                            for (Pet p : pets) {
                                System.out.printf("%s (%s) - %.1f kg - Porte %s %n", p.nome, p.especie, p.peso, p.porte);
                                p.emitirSom();
                            }
                            System.out.println();
                        }
                        break;
                    case 3:
                        boolean achou = false;
                        System.out.println("Qual pet você procura?");
                        String buscar = sc.nextLine();

                        for (Pet p: pets){
                            if(p.nome.equalsIgnoreCase(buscar)){
                                System.out.printf("Encontrado: %s (%s) - %.1f kg - Porte %s %n", p.nome, p.especie, p.peso, p.porte);
                                achou = true;
                            }
                        }
                        System.out.println();

                        if(!achou){
                            System.out.println("Pet não encontrado.");
                        }
                        break;

                    case 4:

                        HashSet<String> especiesSet = new HashSet<>();

                        for (Pet p: pets){
                            especiesSet.add(p.especie);
                        }

                        System.out.println("--- ESPÉCIES CADASTRADAS ---");
                        especiesSet.forEach(System.out::println);
                        System.out.println("Total de espécies diferentes: " +especiesSet.size());
                        break;

                    case 5:
                        System.out.println("Nome do pet para entrar na fila:");
                        String nomePet = sc.nextLine();
                        filaBanho.add(nomePet);
                        System.out.println(nomePet + " entrou na fila de banho.");
                        System.out.println("Fila agora:"+filaBanho);
                        break;

                    case 6:
                        if (filaBanho.isEmpty()) {
                            System.out.println("Não há pets na fila.");
                        } else {
                            System.out.println("Próximo da fila: "+ filaBanho.peek());
                            System.out.println("Atendendo agora: " + filaBanho.poll());
                            System.out.println("Fila atual: " + filaBanho);
                        }
                        break;
                    case 7:
                        System.out.println("Nome do pet:");
                        nomePet = sc.nextLine();

                        for(Servico servico : servicos){
                            servico.executar(nomePet);
                        }
                        break;
                    case 0:

                        break;

                    default:
                        System.out.println("Opção inválida");
                }
            }catch(InputMismatchException ime){
                System.out.println("Digite apenas números!");
                sc.nextLine();
            }
        }
        if (!pets.isEmpty()) {
            mostrarInformacao(pets.get(0));
            System.out.println("---");
            mostrarInformacao(pets.get(0), "=== FICHA DO PET ===");
        }
    }

    public static void mostrarInformacao(Pet pet){
        System.out.println("Nome: " + pet.nome);
    }
    public static void mostrarInformacao(Pet pet, String titulo){
        System.out.println(titulo);
        System.out.println("Nome: " + pet.nome);
        System.out.println("Espécie: " + pet.especie);
        System.out.println("Peso: " + pet.peso + " kg");
        System.out.println("Porte: " + pet.porte);
    }
}
