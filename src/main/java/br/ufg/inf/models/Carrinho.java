package br.ufg.inf.models;

import java.util.HashMap;
import java.util.Map;

public class Carrinho {

    private Map<Produto, Double> cesta;

    public Carrinho() {
        this.cesta = new HashMap<>();
    }

    public void addProduto(Produto produto, double quantidade) {
       this.cesta.put(produto, quantidade);
    }

    public Map<Produto, Double> getCesta() {
        return cesta;
    }
}
