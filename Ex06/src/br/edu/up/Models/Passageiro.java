package br.edu.up.Models;

public class Passageiro extends Pessoa {
    private String identificadorBagagem;
    private Passagem passagem;

    public Passageiro(String nome, String rg, String identificadorBagagem, Passagem passagem2) {
        super(nome, rg);
        this.identificadorBagagem = identificadorBagagem;
        this.passagem = passagem2;
    }

    
    public String getIdentificadorBagagem() {
        return identificadorBagagem;
    }

    public Passagem getPassagem() {
        return passagem;
    }
}

