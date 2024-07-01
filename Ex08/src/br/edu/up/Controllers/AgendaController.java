package br.edu.up.Controllers;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.up.Models.Contato;
import br.edu.up.Models.ContatoComercial;
import br.edu.up.Models.ContatoPessoal;

public class AgendaController {
    private ArrayList<Contato> contatos = new ArrayList<>();
    private int codigoAtual = 1;
    private Scanner scanner = new Scanner(System.in);

    public void incluirContatoPessoal() {
        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite o telefone:");
        String telefone = scanner.nextLine();
        System.out.println("Digite o email:");
        String email = scanner.nextLine();
        ContatoPessoal contato = new ContatoPessoal(String.valueOf(codigoAtual), nome, telefone, email);
        contatos.add(contato);
        codigoAtual++;
        System.out.println("Contato pessoal adicionado com sucesso!");
    }

    public void incluirContatoComercial() {
        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite o telefone:");
        String telefone = scanner.nextLine();
        System.out.println("Digite o nome da empresa:");
        String empresa = scanner.nextLine();
        ContatoComercial contato = new ContatoComercial(String.valueOf(codigoAtual), nome, telefone, empresa);
        contatos.add(contato);
        codigoAtual++;
        System.out.println("Contato comercial adicionado com sucesso!");
    }

    public void excluirContato(String codigo) {
        for (Contato contato : contatos) {
            if (contato.getCodigo().equals(codigo)) {
                contatos.remove(contato);
                System.out.println("Contato removido com sucesso!");
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }

    public void consultarContato(String codigo) {
        for (Contato contato : contatos) {
            if (contato.getCodigo().equals(codigo)) {
                System.out.println("Código: " + contato.getCodigo());
                System.out.println("Nome: " + contato.getNome());
                System.out.println("Telefone: " + contato.getTelefone());
                if (contato instanceof ContatoPessoal) {
                    ContatoPessoal pessoal = (ContatoPessoal) contato;
                    System.out.println("Email: " + pessoal.getEmail());
                } else if (contato instanceof ContatoComercial) {
                    ContatoComercial comercial = (ContatoComercial) contato;
                    System.out.println("Empresa: " + comercial.getEmpresa());
                }
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println("Código: " + contato.getCodigo());
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Telefone: " + contato.getTelefone());
            if (contato instanceof ContatoPessoal) {
                ContatoPessoal pessoal = (ContatoPessoal) contato;
                System.out.println("Email: " + pessoal.getEmail());
            } else if (contato instanceof ContatoComercial) {
                ContatoComercial comercial = (ContatoComercial) contato;
                System.out.println("Empresa: " + comercial.getEmpresa());
            }
            System.out.println();
        }
    }
}

