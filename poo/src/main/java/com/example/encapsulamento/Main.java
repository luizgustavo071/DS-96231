package com.example.encapsulamento;

public class Main {
    public static void main(String[] args) {
        
        //String nome;
        //int idade;

        //nome = "Marta";
        //idade = 22;
        
        //Programação orientada a objetos
        //Cliente cliente1 = new Cliente();
        //cliente1.nome = "Marta";
        //cliente1.idade = 22;
        
        //ENCAPSULAMENTO
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Marta");
        cliente1.setIdade(22);

        Pet pet1 = new Pet();
        pet1.setNome("Fulrencio");
        pet1.setIdade(3);

        Livro livro1 = new Livro();
        livro1.setNome("Clean Code");
        livro1.setPreco(29);

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Elisson");
        funcionario1.setCargo("TI Master");
        funcionario1.setSalario(7.800);

        //System.out.println("Nome: " +cliente1.nome);
        //System.out.println("Idade: " + cliente1.idade);
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());

        // System.out.println("Nome: " + pet1.nome);
        // System.out.println("Idade: " + pet1.idade);
        System.out.println("Nome: " + pet1.getNome());
        System.out.println("Idade: " + pet1.getIdade());

        System.out.println("Nome: " + livro1.getNome());
        System.out.println("Preço: " + livro1.getPreco());

        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Cargo: " + funcionario1.getCargo());
        System.out.println("Salário: R$" + funcionario1.getSalario());
    }

}
