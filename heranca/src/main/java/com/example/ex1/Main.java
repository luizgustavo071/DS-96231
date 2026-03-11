package com.example.ex1;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Cliente("Dwight",26, "08/12/2025","Cartão de crédito." );
        Funcionario funcionario1 = new Funcionario("Earl", 19, 123, "gerente", 7500.00);

        System.out.println(pessoa1.toString());
        System.out.println(funcionario1.toString());
    }
}
