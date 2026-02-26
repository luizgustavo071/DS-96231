package com.example.encapsulamento;

public class Pet {
    //ATRIBUTOS
    private String nome;
    private int idade;
    private String raca;
    private String porte;
    private String alimentacao;

    //CONSTRUTORES

    public Pet(String alimentacao, int idade, String nome, String porte, String raca) {
        this.alimentacao = alimentacao;
        this.idade = idade;
        this.nome = nome;
        this.porte = porte;
        this.raca = raca;
    }
    
    //MÉTODOS
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

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    

}
