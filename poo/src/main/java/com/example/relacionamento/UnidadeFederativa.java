package com.example.relacionamento;

public enum UnidadeFederativa {
    BAHIA("Bahia, BA"),
    SAO_PAULO("São Paulo, SP"),
    RIO_DE_JANEIRO("Rio de Janeiro, RJ"),
    MINAS_GERAIS("Minas Gerais, MG"),;

    private String nome;
    public String getNome() {
        return nome;
    }
    public String getSigla() {
        return sigla;
    }
    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }
    private String sigla;
    UnidadeFederativa(String string) {
    
    }

}
