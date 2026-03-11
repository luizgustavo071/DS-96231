package com.example.atv3;

public class Main {
    public static void main(String[] args) {
        Fisica fisica = new Fisica("Gustavo", "7196322554","02556445608","4112233698","25/03/2007");
        Juridica juridica = new Juridica("Luiz","7189964557","12365478903","140507");

        System.out.println(fisica.toString());
        System.out.println(juridica.toString());
    }
}
