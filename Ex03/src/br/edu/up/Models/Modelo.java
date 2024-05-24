package Ex03.src.br.edu.up.Models;

public class Modelo {
    private String pessoa;
    private String local;
    private String assunto;
    private int horario;
    private int dia;
    private String mes;
    private int ano;

    public Modelo(String pessoa, String local, String assunto, int horario, int dia, String mes, int ano) {
        this.pessoa = pessoa;
        this.local = local;
        this.assunto = assunto;
        this.horario = horario;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    

    

}
