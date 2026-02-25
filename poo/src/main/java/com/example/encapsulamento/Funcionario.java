package com.example.encapsulamento;

public class Funcionario {
    //ATRIBUTOS DE CLASSE
    private String nome;
    private String cargo;
    private double salario;

    //MÉTODOS DE ACESSO
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
