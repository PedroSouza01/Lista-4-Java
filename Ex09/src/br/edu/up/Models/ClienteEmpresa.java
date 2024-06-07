package br.edu.up.Models;

public class ClienteEmpresa {
    private String cnpj;
    private String inscEstadual;
    private int ano;

    public ClienteEmpresa(String cnpj, String inscEstadual, int ano) {
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.ano = ano;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
    
}