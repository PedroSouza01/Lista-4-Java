package br.edu.up.Models;

import java.util.ArrayList;

public class Comissario extends Tripulacao {
    private ArrayList<String> idiomas;

    public Comissario(String nome, String rg, String identificacaoAeronautica, String matriculaFuncionario, ArrayList<String> idiomas) {
        super(nome, rg, identificacaoAeronautica, matriculaFuncionario);
        this.idiomas = idiomas;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }
}

