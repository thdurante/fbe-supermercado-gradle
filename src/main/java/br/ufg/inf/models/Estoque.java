package br.ufg.inf.models;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionaProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public Produto buscaProdutoPeloCodigo(int codigo) {
        Produto produtoEncontrado = null;

        for (Produto produto : this.produtos) {
            if (produto.getCodigo() == codigo) {
                produtoEncontrado = produto;
            }
        }

        return produtoEncontrado;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
