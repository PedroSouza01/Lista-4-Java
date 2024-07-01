package br.edu.up.Views;

import java.util.Scanner;

public class AgendaView {
    private Scanner scanner = new Scanner(System.in);

    public int exibirMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Incluir um contato pessoal");
        System.out.println("2. Incluir um contato comercial");
        System.out.println("3. Excluir um contato pelo código");
        System.out.println("4. Consultar um contato pelo código");
        System.out.println("5. Listar todos os contatos");
        System.out.println("6. Sair do programa");
        System.out.print("Opção: ");
        return scanner.nextInt();
    }

    public String lerCodigo() {
        System.out.print("Digite o código do contato: ");
        return scanner.next();
    }
}
