package com.example.atv1;

public class Main {
    public static void main(String[] args) {
        Processador processador1 = new Processador("AMD", "Ryzen 7 5700g", "4.6HZ");
        Memoria memoria1 = new Memoria("Kingstom Fury", "DDR4", "16GB 3200MHZ");

        System.out.println(processador1.toString());
        System.out.println(memoria1.toString());
    }
}
