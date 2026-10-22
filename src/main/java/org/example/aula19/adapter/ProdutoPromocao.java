package org.example.aula19.adapter;

public class ProdutoPromocao implements Produto{
    @Override
    public String precoEmReais(double preco) {
        return "O preço é: " + preco;
    }
}
