package br.edu.up.Models;

public class SeguroVida extends Seguro {
    private int idadeSegurado;

    public SeguroVida(String numeroApolice, String beneficiario, double valorSeguro, int idadeSegurado) {
        super(numeroApolice, beneficiario, valorSeguro);
        this.idadeSegurado = idadeSegurado;
    }

    public int getIdadeSegurado() {
        return idadeSegurado;
    }

    public void setIdadeSegurado(int idadeSegurado) {
        this.idadeSegurado = idadeSegurado;
    }
}
