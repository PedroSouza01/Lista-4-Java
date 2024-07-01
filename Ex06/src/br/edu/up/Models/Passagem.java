package br.edu.up.Models;

public class Passagem {
    private int numeroAssento;
    private String classeAssento;
    private Data dataVoo;

    public Passagem(int numeroAssento, String classeAssento) {
        this.numeroAssento = numeroAssento;
        this.classeAssento = classeAssento;

    }

    public int getNumeroAssento() {
        return numeroAssento;
    }

    public String getClasseAssento() {
        return classeAssento;
    }

    public Data getDataVoo() {
        return dataVoo;
    }
}
