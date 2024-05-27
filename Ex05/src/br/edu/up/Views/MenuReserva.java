package Ex05.src.br.edu.up.Views;

import java.util.Scanner;

import Ex05.src.br.edu.up.Models.ReservaEmpresa;

public class MenuReserva {
    public void LerMenuReserva() {

        Scanner scan = new Scanner(System.in);

    System.out.println("--MENU PRINICPAL--");

    System.out.println("---Fazer Reservas---");
    
    System.out.println("--Digite 1 se voce for empresa ou 2 se voce for cliente: ");
    int num = scan.nextInt();
    scan.nextLine();

    if(num == 1){
        System.out.println("---Bem Vindo ao Gerenciador Empresa---");

        System.out.println("Digite o nome do evento: ");
        String nome = scan.nextLine();

        System.out.println("Digite a data do evento: ");
        String data = scan.nextLine();

        System.out.println("Digite o local do evento: ");
        String local = scan.nextLine();

        System.out.println("Digite a lotação máxima do evento: ");
        int lotacaoMaxima= scan.nextInt();

        System.out.println("Digite a quantidade ingressos vendidos do evento: ");
        int quantidadeDeIngressosVendidos = scan.nextInt(); 

        System.out.println("Digite o preço do ingresso do evento: ");
        float precoDoIngresso = scan.nextFloat();

        ReservaEmpresa reservaEmpresa = new ReservaEmpresa(nome, data, local, lotacaoMaxima, quantidadeDeIngressosVendidos, precoDoIngresso);

        System.out.println("--" + reservaEmpresa.getNome() + " --");

        System.out.println("-- Data: " + reservaEmpresa.getData() + " --");

        System.out.println("-- Local: " + reservaEmpresa.getLocal() + " --");

        System.out.println("-- Lotação Máxima do Evento: " + reservaEmpresa.getLotacaoMaxima() + " --");

        System.out.println("-- Quantidade de Ingressos Vendidos: " + reservaEmpresa.getQuantidadeDeIngressosVendidos() + " --");

        System.out.println("-- Preço do Ingresso: " + reservaEmpresa.getPrecoDoIngresso() + " --");

    }else if(num == 2){

    }else{
        System.out.println("--ERRO--");
    }

    scan.close();
    }
}
