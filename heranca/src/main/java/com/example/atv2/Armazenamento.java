package com.example.atv2;

public class Armazenamento extends Model{
    private String armazenamento;
    private String conexao;


    public Armazenamento(String marca, String modelo, String armazenamento, String conexao) {
        super(marca, modelo);
        this.armazenamento = armazenamento;
        this.conexao = conexao;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getConexao() {
        return conexao;
    }

    public void setConexao(String conexao) {
        this.conexao = conexao;
    }


    @Override
    public String toString() {
        return "Armazenamento{" +
                "armazenamento='" + armazenamento + '\'' +
                ", conexao='" + conexao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
