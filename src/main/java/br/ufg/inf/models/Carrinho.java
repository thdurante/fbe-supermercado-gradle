package br.ufg.inf.models;

import java.util.HashMap;
import java.util.Map;

public class Carrinho {

    private Map<Integer, Double> cesta;

    public Carrinho() {
        this.cesta = new HashMap<>();
    }

    public void addProduto(int codigoProduto, double quantidade) {
       this.cesta.put(codigoProduto, quantidade);
    }

    public Map<Integer, Double> getCesta() {
        return cesta;
    }
}
