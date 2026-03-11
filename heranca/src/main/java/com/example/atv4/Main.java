package com.example.atv4;

public class Main {
    public static void main(String[] args) {
        Medico medico = new Medico("Jow", "jow@gmail.com",20000, new Endereco("89","Rua A","40105320","alagoas"),"1001");
        Engenheiro engenheiro = new Engenheiro("Jhony","jhony@gmail.com",8000, new Endereco("88","Rua B","45632123","Maracas"),"1478");

        System.out.println(medico.toString());
        System.out.println(engenheiro.toString());

    }
}
