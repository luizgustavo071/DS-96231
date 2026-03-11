package com.example.atv3;

public class Juridica extends Pessoa{
    private String cnpj;
    private String incricaoEstadual;


    public Juridica(String nome, String telefone, String cnpj, String incricaoEstadual) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.incricaoEstadual = incricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIncricaoEstadual() {
        return incricaoEstadual;
    }

    public void setIncricaoEstadual(String incricaoEstadual) {
        this.incricaoEstadual = incricaoEstadual;
    }


    @Override
    public String toString() {
        return "Juridica{" +
                "cnpj='" + cnpj + '\'' +
                ", incricaoEstadual='" + incricaoEstadual + '\'' +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
