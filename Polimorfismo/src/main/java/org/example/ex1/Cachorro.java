package org.example.ex1;

public class Cachorro implements Animal {


    @Override
    public String emitirSom() {
        return "AUAU!";
    }

    @Override
    public String comer() {
        return "Ração";
    }
}
