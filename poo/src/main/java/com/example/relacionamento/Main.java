package com.example.relacionamento;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("joao", 30, 001, 2000.00, Sexo.MASCULINO, UnidadeFederativa.BAHIA);
        
        System.out.println(pessoa1.toString());
    }

}
