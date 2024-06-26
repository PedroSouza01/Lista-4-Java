package Ex01.src.br.edu.up.Models;
import Ex01.src.br.edu.up.Controllers.Controle;

public class Biblioteca {

    Controle controle = new Controle();

    private String codigo;
    private String titulo;
    private String autor;
    private String isbn;
    private int ano;
    
    public Biblioteca(String codigo, String titulo, String autor, String isbn, int ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.ano = ano;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    

    


}
