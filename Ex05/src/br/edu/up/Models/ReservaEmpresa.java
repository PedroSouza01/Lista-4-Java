package Ex05.src.br.edu.up.Models;

public class ReservaEmpresa {
    private String nome;
    private String data;
    private String local;
    private int lotacaoMaxima;
    private int quantidadeDeIngressosVendidos;
    private float precoDoIngresso;

    public ReservaEmpresa(String nome, String data, String local, int lotacaoMaxima, int quantidadeDeIngressosVendidos, float precoDoIngresso) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.lotacaoMaxima = lotacaoMaxima;
        this.quantidadeDeIngressosVendidos = quantidadeDeIngressosVendidos;
        this.precoDoIngresso = precoDoIngresso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getLotacaoMaxima() {
        return lotacaoMaxima;
    }

    public void setLotacaoMaxima(int lotacaoMaxima) {
        this.lotacaoMaxima = lotacaoMaxima;
    }

    public int getQuantidadeDeIngressosVendidos() {
        return quantidadeDeIngressosVendidos;
    }

    public void setQuantidadeDeIngressosVendidos(int quantidadeDeIngressosVendidos) {
        this.quantidadeDeIngressosVendidos = quantidadeDeIngressosVendidos;
    }

    public float getPrecoDoIngresso() {
        return precoDoIngresso;
    }

    public void setPrecoDoIngresso(float precoDoIngresso) {
        this.precoDoIngresso = precoDoIngresso;
    }
    
    
    
}
