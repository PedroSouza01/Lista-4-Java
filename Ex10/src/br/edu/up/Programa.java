package br.edu.up;

import br.edu.up.Controllers.SeguroController;
import br.edu.up.Models.SeguroVeiculo;
import br.edu.up.Models.SeguroVida;
import br.edu.up.Views.SeguroView;

public class Programa {
    public static void main(String[] args) {
        SeguroController controller = new SeguroController();
        SeguroView view = new SeguroView();

        int opcao;
        do {
            opcao = view.exibirMenu();
            switch (opcao) {
                case 1:
                    SeguroVida seguroVida = view.lerSeguroVida();
                    controller.adicionarSeguro(seguroVida);
                    break;
                case 2:
                    SeguroVeiculo seguroVeiculo = view.lerSeguroVeiculo();
                    controller.adicionarSeguro(seguroVeiculo);
                    break;
                case 3:
                    controller.excluirTodosSeguros();
                    break;
                case 4:
                    System.out.println("Quantidade de seguros: " + controller.quantidadeSeguros());
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 5);
    }
}
