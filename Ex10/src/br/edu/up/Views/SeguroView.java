package br.edu.up.Views;

import java.util.Scanner;

import br.edu.up.Models.SeguroVeiculo;
import br.edu.up.Models.SeguroVida;

public class SeguroView {
    private Scanner scanner = new Scanner(System.in);

    public int exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Adicionar seguro de vida");
        System.out.println("2. Adicionar seguro de veículo");
        System.out.println("3. Excluir todos os seguros");
        System.out.println("4. Quantidade de seguros");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public SeguroVida lerSeguroVida() {
        System.out.print("Número da apólice: ");
        String numeroApolice = scanner.next();
        System.out.print("Beneficiário: ");
        String beneficiario = scanner.next();
        System.out.print("Valor do seguro: ");
        double valorSeguro = scanner.nextDouble();
        System.out.print("Idade do segurado: ");
        int idadeSegurado = scanner.nextInt();
        return new SeguroVida(numeroApolice, beneficiario, valorSeguro, idadeSegurado);
    }

    public SeguroVeiculo lerSeguroVeiculo() {
        System.out.print("Número da apólice: ");
        String numeroApolice = scanner.next();
        System.out.print("Beneficiário: ");
        String beneficiario = scanner.next();
        System.out.print("Valor do seguro: ");
        double valorSeguro = scanner.nextDouble();
        System.out.print("Marca do veículo: ");
        String marcaVeiculo = scanner.next();
        System.out.print("Modelo do veículo: ");
        String modeloVeiculo = scanner.next();
        System.out.print("Ano de fabricação do veículo: ");
        int anoFabricacao = scanner.nextInt();
        return new SeguroVeiculo(numeroApolice, beneficiario, valorSeguro, marcaVeiculo, modeloVeiculo, anoFabricacao);
    }
}
