package com.example.encapsulamento;

public class Livros {
    //ATRIBUTOS
    private String titulo;
    private String autor;
    private int npaginas;
    private double preco;
    
    //CONSTRUTORES
    public Livros(String titulo, String autor, int npaginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.npaginas = npaginas;
        this.preco = preco;
    }

    //MÉTODOS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNpaginas() {
        return npaginas;
    }

    public void setNpaginas(int npaginas) {
        this.npaginas = npaginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    

}
