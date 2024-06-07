package br.edu.up.Controllers;

public class DespesasClientePessoa {
    private double valorEmprestado;
    private double valorDevolucao;
    private double valor;
    

    public double getValorDevolucao() {
        return valorDevolucao;
    }

    public void setValorDevolucao(double valorDevolucao) {
        this.valorDevolucao = valorDevolucao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public DespesasClientePessoa(double valorEmprestado) {
        this.valorEmprestado = valorEmprestado;
    }

    public double getValorEmprestado() {
        return valorEmprestado;
    }

    public void setValorEmprestado(double valorEmprestado) {
        this.valorEmprestado = valorEmprestado;
    }

    public void emprestarClientePessoa(){
        if (valorEmprestado <= 10000 && valorEmprestado > 0) {
            valor = valorEmprestado;
            System.out.println("O valor de " + valorEmprestado + " Reais foi depositado com sucesso!");
        } else{
            System.out.println("!Erro!");
        }
    }
    
    public void creditarClientePessoa(){
        
        if(valorDevolucao <= valorEmprestado && valorDevolucao > 0){
            valor = valorEmprestado - valorDevolucao;
        System.out.println("Devolução Realizada com Sucesso!");
    
    }else{
        System.out.println("!Erro!");
    }
    }
}
