package org.example.ex1;

public class Gato implements Animal {

    @Override
    public String emitirSom() {
        return "MIAU!";
    }

    @Override
    public String comer() {
        return "Ração pedegree";
    }
}
