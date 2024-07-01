package br.edu.up;


    import java.util.Scanner;

import br.edu.up.Controllers.AgendaController;
import br.edu.up.Views.AgendaView;

    public class Programa {
        public static void main(String[] args) {
            AgendaController controller = new AgendaController();
            AgendaView view = new AgendaView();
            Scanner scanner = new Scanner(System.in);
    
            int opcao;
            do {
                opcao = view.exibirMenu();
                scanner.nextLine(); // Consumir a nova linha
    
                switch (opcao) {
                    case 1:
                        controller.incluirContatoPessoal();
                        break;
                    case 2:
                        controller.incluirContatoComercial();
                        break;
                    case 3:
                        String codigoExclusao = view.lerCodigo();
                        controller.excluirContato(codigoExclusao);
                        break;
                    case 4:
                        String codigoConsulta = view.lerCodigo();
                        controller.consultarContato(codigoConsulta);
                        break;
                    case 5:
                        controller.listarContatos();
                        break;
                    case 6:
                        System.out.println("Encerrando o programa...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } while (opcao != 6);
        }
    }
    
    