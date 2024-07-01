package br.edu.up.Models;

public abstract class Contato {
    protected String codigo;
    protected String nome;
    protected String telefone;

    public Contato(String codigo, String nome, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}

