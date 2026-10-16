package org.example.petshop;

import java.util.ArrayDeque;
import java.util.Queue;

public class FilaBanho {
    private final Queue<String> fila = new ArrayDeque<>();

    public void entrar(String nomePet) {
        fila.add(nomePet);
    }

    public boolean estaVazia() {
        return fila.isEmpty();
    }

    public String proximo() {
        return fila.peek();
    }

    public String atender() {
        return fila.poll();
    }

    @Override
    public String toString() {
        return fila.toString();
    }
}
