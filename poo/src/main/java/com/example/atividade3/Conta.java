package com.example.atividade3;

public class Conta {
    public Conta(String banco, String agencia, String numero_conta, String tipo_conta, String saldo, String limite) {
        this.banco = Integer.parseInt(banco);
        this.agencia = agencia;
        this.numero_conta = numero_conta;
        this.tipo_conta = tipo_conta;
        this.saldo = saldo;
        this.limite = limite;
    }

    private String banco;

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }

    public String getTipo_conta() {
        return tipo_conta;
    }

    public void setTipo_conta(String tipo_conta) {
        this.tipo_conta = tipo_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    private int agencia;
    private double numero_conta;
    private String tipo_conta;
    private double saldo;
    private double limite;
}
