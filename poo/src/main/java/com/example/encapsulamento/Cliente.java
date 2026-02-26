package com.example.encapsulamento;

public class Cliente {
    //ATRIBUTOS DA CLASSE.
    private String nome;
    private int idade;   


    //CONSTRUTOR
    public Cliente(int idade, String nome) {
    this.idade = idade;
        this.nome = nome;
    }


    //MÉTODOS DE ACESSO.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
