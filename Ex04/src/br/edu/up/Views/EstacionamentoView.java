package br.edu.up.Views;
import java.util.Scanner;

import br.edu.up.Models.Carro;

public class EstacionamentoView {
    private Scanner scanner = new Scanner(System.in);

    public Carro cadastrarCarro() {
        System.out.println("Informe o modelo do carro:");
        String modelo = scanner.nextLine();
        System.out.println("Informe a placa do carro:");
        String placa = scanner.nextLine();
        System.out.println("Informe a cor do carro:");
        String cor = scanner.nextLine();
        return new Carro(modelo, placa, cor);
    }

    public String lerPlaca() {
        System.out.println("Informe a placa do carro:");
        return scanner.nextLine();
    }

    public void exibirMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Entrar no estacionamento");
        System.out.println("2 - Sair do estacionamento");
        System.out.println("3 - Emitir relatório");
        System.out.println("0 - Sair");
    }
}
