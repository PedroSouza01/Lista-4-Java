package br.edu.up.Models;

public class ContatoPessoal extends Contato {
    private String email;

    public ContatoPessoal(String codigo, String nome, String telefone, String email) {
        super(codigo, nome, telefone);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
