package br.ufg.inf.models;

public class Endereco {

    private String rua;
    private String cep;
    private String numero;

    public Endereco(String rua, String cep, String numero) {
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
    }

    public String getRua() {
        return this.rua;
    }

    public String getCep() {
        return this.cep;
    }

    public String getNumero() {
        return this.numero;
    }
}
