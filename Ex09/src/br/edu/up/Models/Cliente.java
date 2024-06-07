package br.edu.up.Models;

public class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private String endereco;
    private double vlrMaxCredito;
    private double vlremprestado;
    
    public Cliente(String nome, String telefone, String email, String endereco, double vlrMaxCredito,
            double vlremprestado) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.vlrMaxCredito = vlrMaxCredito;
        this.vlremprestado = vlremprestado;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public double getVlrMaxCredito() {
        return vlrMaxCredito;
    }
    public void setVlrMaxCredito(double vlrMaxCredito) {
        this.vlrMaxCredito = vlrMaxCredito;
    }
    public double getVlremprestado() {
        return vlremprestado;
    }
    public void setVlremprestado(double vlremprestado) {
        this.vlremprestado = vlremprestado;
    }

    
    
}