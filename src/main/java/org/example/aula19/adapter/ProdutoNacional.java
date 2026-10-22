package org.example.aula19.adapter;

public class ProdutoNacional implements Produto{
    @Override
    public String precoEmReais(double preco) {
        return "O preço é: " + preco;
    }
}
