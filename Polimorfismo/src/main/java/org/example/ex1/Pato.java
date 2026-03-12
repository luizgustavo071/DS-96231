package org.example.ex1;

public class Pato implements Animal{
    @Override
    public String emitirSom() {
        return "Quác";
    }

    @Override
    public String comer() {
        return "Pequenos peixe";
    }
}
