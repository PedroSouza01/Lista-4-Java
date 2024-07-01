package br.edu.up.Models;

public abstract class Seguro {
    private String numeroApolice;
    private String beneficiario;
    private double valorSeguro;

    public Seguro(String numeroApolice, String beneficiario, double valorSeguro) {
        this.numeroApolice = numeroApolice;
        this.beneficiario = beneficiario;
        this.valorSeguro = valorSeguro;
    }

    public String getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(String numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }
}
