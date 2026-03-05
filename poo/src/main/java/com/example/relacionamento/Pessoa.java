package com.example.relacionamento;

public class Pessoa {
    private String nome;
    public Pessoa(String nome, int idade, int id, double salario, Sexo sexo, UnidadeFederativa estado) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.salario = salario;
        this.sexo = sexo;
        this.estado = estado;
    }
    private int idade;
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
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    public UnidadeFederativa getEstado() {
        return estado;
    }
    public void setEstado(UnidadeFederativa estado) {
        this.estado = estado;
    }
    private int id;
    private double salario;
    private Sexo sexo;
    private UnidadeFederativa estado;
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", id=" + id + ", salario=" + salario + ", sexo=" + sexo
                + ", estado=" + estado + "]";
    }

    

}
