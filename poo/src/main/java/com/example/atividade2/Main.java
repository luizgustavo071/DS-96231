package com.example.atividade2;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Rex", "5 anos", "Labrador");
        Cliente cliente1 = new Cliente("João", "30 anos", pet1);

        Cliente cliente2 = new Cliente("Jhonny", 21 + "anos",
                new Pet("Mike", "2 anos", "Poodle"));

        System.out.println("Nome do cliente: " + cliente1.getNome());
        System.out.println("Idade do cliente: " + cliente1.getIdade());
        System.out.println("Nome do pet: " + cliente1.getPet().getNome());
        System.out.println("Idade do pet: " + cliente1.getPet().getIdade());
        System.out.println("Raça do pet: " + cliente1.getPet().getRaca());
    }
}
