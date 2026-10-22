package org.example.aula19.adapter;

public class Main {
    public static void main(String[] args) {

        Produto blusa = new ProdutoNacional();
        blusa.precoEmReais(60.00);

        Produto blusaAmericana = new ProdutoInternacionalAdapter();
        blusaAmericana.precoEmReais(30);

    }
}
