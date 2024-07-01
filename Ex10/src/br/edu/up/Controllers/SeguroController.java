package br.edu.up.Controllers;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.up.Models.Seguro;

public class SeguroController {
    private ArrayList<Seguro> seguros = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void adicionarSeguro(Seguro seguro) {
        if (verificarNumeroApolice(seguro.getNumeroApolice())) {
            System.out.println("Número de apólice já existe!");
            return;
        }
        seguros.add(seguro);
        System.out.println("Seguro adicionado com sucesso!");
    }

    private boolean verificarNumeroApolice(String numeroApolice) {
        for (Seguro s : seguros) {
            if (s.getNumeroApolice().equals(numeroApolice)) {
                return true;
            }
        }
        return false;
    }

    public void excluirTodosSeguros() {
        System.out.println("Tem certeza que deseja excluir todos os seguros? (S/N)");
        String confirmacao = scanner.next();
        if (confirmacao.equalsIgnoreCase("S")) {
            seguros.clear();
            System.out.println("Todos os seguros foram excluídos.");
        } else {
            System.out.println("Operação cancelada.");
        }
    }

    public int quantidadeSeguros() {
        return seguros.size();
    }
}

