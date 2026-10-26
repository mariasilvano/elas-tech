package org.example.aula24.padroescomportamentais.observer;

public class Main {
    static void main() {
        Canal canal = new Canal();

        Seguidor joao = new Seguidor("João");
        Seguidor maria = new Seguidor("Maria");

        canal.inscricao(joao);
        canal.inscricao(maria);

        canal.postarVideo("Meu novo vídeo");

    }
}
