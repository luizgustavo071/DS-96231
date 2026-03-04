package com.example.atividade1;

public class Main {
    public static void main(String[] args) {
        Endereço endereco1 = new Endereço("Rua A", "123", "Salvador", "12345-678");
        Cliente cliente1 = new Cliente("João", "30", endereco1.getLogradouro() + ", " + endereco1.getNumero() + ", " + endereco1.getCidade() + ", " + endereco1.getCep());

        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("Endereço: " + cliente1.getEndereco());
    }

}
