package br.edu.up.Models;
public class SeguroVeiculo extends Seguro {
    private String marcaVeiculo;
    private String modeloVeiculo;
    private int anoFabricacao;

    public SeguroVeiculo(String numeroApolice, String beneficiario, double valorSeguro, String marcaVeiculo, String modeloVeiculo, int anoFabricacao) {
        super(numeroApolice, beneficiario, valorSeguro);
        this.marcaVeiculo = marcaVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.anoFabricacao = anoFabricacao;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}
