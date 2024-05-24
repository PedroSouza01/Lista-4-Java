package Ex01.src.br.edu.up.Views;

import java.util.Scanner;

import Ex01.src.br.edu.up.Models.Biblioteca;

public class Livro {
    
  
    public void mostrarTelas(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o Codigo do livro: ");
        String codigo = scan.nextLine();

        System.out.println("Digite o Titulo do livro: ");
        String titulo = scan.nextLine();

        System.out.println("Digite os autores do livro: ");
        String autor = scan.nextLine();

        System.out.println("Digite o Isbn do Livro: ");
        String isbn = scan.nextLine();

        System.out.println("Digite o Ano do livro: ");
        int ano = scan.nextInt();

        Biblioteca biblioteca = new Biblioteca(codigo, titulo, autor, isbn, ano);

        System.out.println("------Livros------");
        System.out.println("\n-Livro 1:");
        System.out.println("Código: " + biblioteca.getCodigo());
        System.out.println("Titulo: " + biblioteca.getTitulo());
        System.out.println("Autores: " + biblioteca.getAutor());
        System.out.println("Isbn: " + biblioteca.getIsbn());
        System.out.println("Ano: " + biblioteca.getAno() + "\n");

        scan.close();
  }   
}
