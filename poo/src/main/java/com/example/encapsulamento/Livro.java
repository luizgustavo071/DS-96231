package com.example.encapsulamento;

public class Livro {
    //ATRIBUTOS DA CLASSE
    private String nome;
    private double  preco;

    //MÉTODO DE ACESSO
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

}
