package br.edu.up.Views;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import br.edu.up.Controllers.DespesasClientePessoa;
import br.edu.up.Controllers.DespesasClienteEmpresa;
import br.edu.up.Models.ClienteEmpresa;
import br.edu.up.Models.ClientePessoa;

public class MenuPrincipal {
    public void mostrarMenu(){
        Scanner scan = new Scanner(System.in);

        while (true) {
        System.out.println("---Menu Principal---");

        System.out.println("1- Incluir cliente pessoa --");

        System.out.println("2- Incluir cliente empresa --");

        System.out.println("3- Mostrar dados cliente pessoa --");

        System.out.println("4- Mostrar dados cliente empresa --");

        System.out.println("5- Emprestar para cliente pessoa --");

        System.out.println("6- Emprestar para cliente empresa --");

        System.out.println("7- Devolução de cliente pessoa  --");

        System.out.println("8- Devolução de cliente empresa --");

        System.out.println("9- Sair --");

        int num = scan.nextInt();

       
        switch (num) {
            case 1:
        
                System.out.println("-Incluir Cliente Pessoa-");

                System.out.println("Digite o CPF: ");
                String cpf = scan.next();

                System.out.println("Digite o Peso: ");
                String peso = scan.next();

                System.out.println("Digite a altura: ");
                String altura = scan.next();

                ClientePessoa clientePessoa = new ClientePessoa(cpf, peso, altura);

                 // Escreve os dados do cliente pessoa em um arquivo
                 
                try (FileWriter writer = new FileWriter("DadosClientepessoa.txt", true)) {
                    writer.write("CPF: " + cpf + ", Peso: " + peso + ", Altura: " + altura + "\n");
                } catch (IOException e) {
                    System.out.println("Ocorreu um erro ao salvar os dados do cliente pessoa.");
                    e.printStackTrace();
                }

                break;

            case 2:
            System.out.println("-Incluir Cliente Empresa-");

            System.out.println("Digite o cnpj: ");
            String cnpj = scan.next();

            System.out.println("Digite a inscrição Estadual: ");
            String inscEstadual = scan.next();

            System.out.println("Digite o ano de fundação: ");
            int ano = scan.nextInt();

            ClienteEmpresa clienteEmpresa = new ClienteEmpresa (cnpj, inscEstadual, ano);

            try (FileWriter writer = new FileWriter("DadosClienteEmpresa.txt", true)) {
                writer.write("Cnpj: " + cnpj + ", Iscrição Estadual: " + inscEstadual + ", Ano de Fundação: " + ano + "\n");
            } catch (IOException e) {
                System.out.println("Ocorreu um erro ao salvar os dados do cliente pessoa.");
                e.printStackTrace();
            }
                break;
                
            case 3:

                 System.out.println("-Dados dos Clientes Pessoa-");

        try (BufferedReader reader = new BufferedReader(new FileReader("DadosClientepessoa.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler os dados dos clientes pessoa.");
            e.printStackTrace();
        }

                break;

            case 4:
                
            System.out.println("-Dados dos Clientes Pessoa-");

            try (BufferedReader reader = new BufferedReader(new FileReader("DadosClienteEmpresa.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Ocorreu um erro ao ler os dados dos clientes pessoa.");
                e.printStackTrace();
            }

                break;

            case 5:
                System.out.println("-Emprestar para Cliente Pessoa-");

                System.out.println("Digite qual o valor desejado para Emprestimo: ");
                double valorEmprestado = scan.nextDouble(); 

                DespesasClientePessoa emprestimo = new DespesasClientePessoa(valorEmprestado);

                emprestimo.emprestarClientePessoa();

                break;
                
            case 6:
                
            System.out.println("-Emprestar para Cliente Empresa-");

            System.out.println("Digite qual o valor desejado para Emprestimo: ");
            double valorEmprestadoEmpresa = scan.nextDouble(); 

            DespesasClienteEmpresa emprestimoEmpresa = new DespesasClienteEmpresa(valorEmprestadoEmpresa);

            emprestimoEmpresa.emprestarClienteEmpresa();

                break;

            case 7:
                System.out.println("-Devolução de cliente pessoa-");

                System.out.println("Digite qual é o valor desejado para a devolução: ");
                double valorDevolucao = scan.nextDouble();

                DespesasClientePessoa devolucao = new DespesasClientePessoa(valorDevolucao);

                devolucao.creditarClientePessoa();
                break;

            case 8:
                
            System.out.println("-Devolução de cliente Empresa-");

            System.out.println("Digite qual é o valor desejado para a devolução: ");
            double valorDevolucaoEmpresa = scan.nextDouble();

            DespesasClientePessoa devolucaoEmpresa = new DespesasClientePessoa(valorDevolucaoEmpresa);

            devolucaoEmpresa.creditarClientePessoa();

                break;

            case 9:
                System.out.println("Saindo...");
                System.exit(0);
                break;
        
            default:
                break;
        }
    }
  }
}