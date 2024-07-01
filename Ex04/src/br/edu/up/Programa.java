package br.edu.up;
import java.util.ArrayList;
import java.util.Scanner;

import br.edu.up.Controllers.EstacionamentoController;
import br.edu.up.Models.Carro;
import br.edu.up.Views.EstacionamentoView;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        EstacionamentoController controller = new EstacionamentoController();
        EstacionamentoView view = new EstacionamentoView();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            view.exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    Carro novoCarro = view.cadastrarCarro();
                    controller.entrar(novoCarro);
                    break;
                case 2:
                    String placa = view.lerPlaca();
                    controller.sair(placa);
                    break;
                case 3:
                    controller.emitirRelatorio();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }
}
