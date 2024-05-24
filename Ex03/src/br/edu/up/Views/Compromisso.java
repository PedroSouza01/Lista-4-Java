package Ex03.src.br.edu.up.Views;

import java.util.Scanner;

import Ex03.src.br.edu.up.Models.Modelo;

public class Compromisso {
    public void mostrarTelas(){
        Scanner scan = new Scanner(System.in);

        System.out.println("------Bem vindo a Agenda de compromisso------");

            System.out.println("Digite a pessoa desejada: ");
            String pessoa = scan.nextLine();

            System.out.println("Digite o local desejado: ");
            String local = scan.nextLine();

            System.out.println("Digite o assunto desejado: ");
            String assunto = scan.nextLine();

            System.out.println("Digite o horario desejado: ");
            int horario = scan.nextInt();

            System.out.println("Digite o dia: ");
            int dia = scan.nextInt();

            System.out.println("Digite o mês: ");
            String mes = scan.nextLine();

            System.out.println("Digite o Ano: ");
            int ano = scan.nextInt();

            Modelo modelo = new Modelo(pessoa, local, assunto, horario, dia, mes, ano);

            System.out.println("\n------Compromisso criado com sucesso------\n");

            System.out.println("Pessoa: " + modelo.getPessoa());
            System.out.println("Local: " + modelo.getLocal());
            System.out.println("Assunto: " + modelo.getAssunto());
            System.out.println("Horario: " + modelo.getHorario()  + " Hrs");
            System.out.println("Dia: " + modelo.getDia());
            System.out.println("Mês: " + modelo.getMes());
            System.out.println("Ano: " + modelo.getAno());

        scan.close();
    }
}
