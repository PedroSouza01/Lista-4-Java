package br.edu.up.Models;

public class ContatoComercial extends Contato {
    private String empresa;

    public ContatoComercial(String codigo, String nome, String telefone, String empresa) {
        super(codigo, nome, telefone);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }
}
