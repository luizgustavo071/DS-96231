package com.example.atividade1;

public class Endereço {
    //ATRIBUTOS
    private String logradouro;
    private String numero;

    //CONSTRUTOR
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    //MÉTODOS DE ACESSO
    private String cidade;

    public Endereço(String logradouro, String numero, String cidade, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;
    }

    private String cep;



}
