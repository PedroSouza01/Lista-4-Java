package br.edu.up.Views;

import java.util.Scanner;

import br.edu.up.Models.Aeronave;
import br.edu.up.Models.Data;
import br.edu.up.Models.Passageiro;
import br.edu.up.Models.Passagem;
import br.edu.up.Models.Tripulacao;

import java.util.ArrayList;

public class ControleTrafegoView {
    private Scanner scanner = new Scanner(System.in);

    public Passageiro cadastrarPassageiro() {
        System.out.println("Informe o nome do passageiro:");
        String nome = scanner.nextLine();
        System.out.println("Informe o RG do passageiro:");
        String rg = scanner.nextLine();
        System.out.println("Informe o identificador da bagagem:");
        String identificadorBagagem = scanner.nextLine();
        System.out.println("Informe o número do assento:");
        int numeroAssento = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Informe a classe do assento:");
        String classeAssento = scanner.nextLine();
        System.out.println("Informe a data do voo (dia mês ano hora minuto):");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int ano = scanner.nextInt();
        int hora = scanner.nextInt();
        int minuto = scanner.nextInt();
        scanner.nextLine(); 
        Data dataVoo = new Data(dia, mes, ano, hora, minuto);
        Passagem passagem = new Passagem(numeroAssento, classeAssento);
        return new Passageiro(nome, rg, identificadorBagagem, passagem);
    }

    public Tripulacao cadastrarTripulacao() {
        System.out.println("Informe o nome do membro da tripulação:");
        String nome = scanner.nextLine();
        System.out.println("Informe o RG do membro da tripulação:");
        String rg = scanner.nextLine();
        System.out.println("Informe a identificação aeronáutica:");
        String identificacaoAeronautica = scanner.nextLine();
        System.out.println("Informe a matrícula do funcionário:");
        String matriculaFuncionario = scanner.nextLine();
        return new Tripulacao(nome, rg, identificacaoAeronautica, matriculaFuncionario);
    }

    public Aeronave cadastrarAeronave() {
        System.out.println("Informe o código da aeronave:");
        String codigo = scanner.nextLine();
        System.out.println("Informe o tipo da aeronave:");
        String tipo = scanner.nextLine();
        System.out.println("Informe a quantidade de assentos da aeronave:");
        int quantidadeAssentos = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        return new Aeronave(codigo, tipo, quantidadeAssentos);
    }

    public void exibirMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastrar passageiro");
        System.out.println("2 - Cadastrar tripulação");
        System.out.println("3 - Definir aeronave");
        System.out.println("4 - Exibir passageiros");
        System.out.println("5 - Exibir tripulação");
        System.out.println("0 - Sair");
    }
}

