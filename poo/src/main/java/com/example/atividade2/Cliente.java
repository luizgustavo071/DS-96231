package com.example.atividade2;

public class Cliente {
    public Cliente(String nome, String idade, com.example.atividade2.Pet pet) {
        this.nome = nome;
        this.idade = idade;
        Pet = pet;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public com.example.atividade2.Pet getPet() {
        return Pet;
    }

    public void setPet(com.example.atividade2.Pet pet) {
        Pet = pet;
    }

    //ATRIBUTOS
    private String nome;
    private String idade;
    private Pet Pet;




}

