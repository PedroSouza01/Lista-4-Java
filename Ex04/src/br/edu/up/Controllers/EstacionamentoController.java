package br.edu.up.Controllers;
import java.util.ArrayList;

import br.edu.up.Models.Carro;

public class EstacionamentoController {
    private ArrayList<Carro> vagas = new ArrayList<>();
    private int contadorEntradas = 0;
    private int contadorSaidas = 0;
    private double valorTotal = 0;

    public boolean entrar(Carro carro) {
        if (vagas.size() < 10) {
            vagas.add(carro);
            contadorEntradas++;
            return true;
        } else {
            System.out.println("Estacionamento lotado!");
            return false;
        }
    }

    public boolean sair(String placa) {
        for (Carro carro : vagas) {
            if (carro.getPlaca().equals(placa)) {
                vagas.remove(carro);
                contadorSaidas++;
                valorTotal += 5.0;
                return true;
            }
        }
        System.out.println("Carro com placa " + placa + " não encontrado no estacionamento.");
        return false;
    }

    public void emitirRelatorio() {
        System.out.println("Veículos que entraram: " + contadorEntradas);
        System.out.println("Veículos que saíram: " + contadorSaidas);
        System.out.println("Valor total arrecadado: R$ " + valorTotal);
    }
}
