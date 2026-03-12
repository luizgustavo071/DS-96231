package org.example.atv1;

public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();

        System.out.println("Soma: " + soma.calcular(10,10));
        System.out.println("Subtração: " + subtracao.calcular(10,10));
        System.out.println("Divisão: " + divisao.calcular(10,10));
        System.out.println("Multiplicação: " + multiplicacao.calcular(10,10));
    }
}
