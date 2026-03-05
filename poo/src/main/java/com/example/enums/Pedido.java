package com.example.enums;

public enum Pedido {
    ABERTO("Aberto"),
    CANCELADO("Cancelado"),
    CONCLUIDO("Concluido");

    private Pedido(String texto) {
        this.texto = texto;
    }

    private String texto;

    
    

}
