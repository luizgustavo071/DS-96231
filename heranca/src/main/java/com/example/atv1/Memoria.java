package com.example.atv1;

public class Memoria extends Model {
    private String capacidaDeArmazenamento;


    public Memoria(String marca, String modelo, String capacidaDeArmazenamento) {
        super(marca, modelo);
        this.capacidaDeArmazenamento = capacidaDeArmazenamento;
    }

    public String getCapacidaDeArmazenamento() {
        return capacidaDeArmazenamento;
    }

    public void setCapacidaDeArmazenamento(String capacidaDeArmazenamento) {
        this.capacidaDeArmazenamento = capacidaDeArmazenamento;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "capacidaDeArmazenamento='" + capacidaDeArmazenamento + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

}
