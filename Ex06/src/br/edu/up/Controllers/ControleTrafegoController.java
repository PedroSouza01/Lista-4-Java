package br.edu.up.Controllers;

import java.util.ArrayList;

import br.edu.up.Models.Aeronave;
import br.edu.up.Models.Passageiro;
import br.edu.up.Models.Tripulacao;

public class ControleTrafegoController {
    private ArrayList<Passageiro> passageiros = new ArrayList<>();
    private ArrayList<Tripulacao> tripulacao = new ArrayList<>();
    private Aeronave aeronave;

    public void cadastrarPassageiro(Passageiro passageiro) {
        passageiros.add(passageiro);
    }

    public void cadastrarTripulacao(Tripulacao membroTripulacao) {
        tripulacao.add(membroTripulacao);
    }

    public void definirAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    public void exibirPassageiros() {
        System.out.println("Passageiros:");
        for (Passageiro passageiro : passageiros) {
            System.out.println("Nome: " + passageiro.getNome() + ", RG: " + passageiro.getRg());
        }
    }

    public void exibirTripulacao() {
        System.out.println("Tripulação:");
        for (Tripulacao membroTripulacao : tripulacao) {
            System.out.println("Nome: " + membroTripulacao.getNome() + ", RG: " + membroTripulacao.getRg());
        }
    }
}

