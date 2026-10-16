package org.example.petshop;

import java.util.ArrayList;
import java.util.HashSet;

public class CadastroPets {
    private final ArrayList<Pet> pets = new ArrayList<>();

    public void adicionar(Pet pet) {
        pets.add(pet);
    }

    public boolean estaVazio() {
        return pets.isEmpty();
    }

    public int total() {
        return pets.size();
    }

    public ArrayList<Pet> listar() {
        return new ArrayList<>(pets);
    }

    public ArrayList<Pet> buscarPorNome(String nome) {
        ArrayList<Pet> encontrados = new ArrayList<>();
        for (Pet p : pets) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                encontrados.add(p);
            }
        }
        return encontrados;
    }

    public HashSet<String> especies() {
        HashSet<String> especies = new HashSet<>();
        for (Pet p : pets) {
            especies.add(p.getEspecie());
        }
        return especies;
    }

    public Pet primeiro() {
        return pets.get(0);
    }
}
