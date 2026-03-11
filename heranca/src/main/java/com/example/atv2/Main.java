package com.example.atv2;

public class Main {
    public static void main(String[] args) {
        Processador processador = new Processador("AMD","Ryzen 5 5600g", "4.5 HZ");
        Memoria memoria = new Memoria("Kingstom", "DDR4", "16 GB");
        PlacaMae placaMae = new PlacaMae("Asus", "A520", "AM4");
        Armazenamento armazenamento = new Armazenamento("Kingstom", "NV3","1TB", "NVME");

        System.out.println(processador.toString());
        System.out.println(memoria.toString());
        System.out.println(placaMae.toString());
        System.out.println(armazenamento.toString());


    }
}
