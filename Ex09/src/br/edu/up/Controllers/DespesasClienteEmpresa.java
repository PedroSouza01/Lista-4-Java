package br.edu.up.Controllers;

public class DespesasClienteEmpresa {
    private double valorEmprestadoEmpresa;
    private double valor;
    private double valorDevolucaoEmpresa;
    
    
    

    public DespesasClienteEmpresa(double valorEmprestadoEmpresa) {
        this.valorEmprestadoEmpresa = valorEmprestadoEmpresa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorEmprestadoEmpresa() {
        return valorEmprestadoEmpresa;
    }

    public void setValorEmprestadoEmpresa(double valorEmprestadoEmpresa) {
        this.valorEmprestadoEmpresa = valorEmprestadoEmpresa;
    }

    public void emprestarClienteEmpresa(){
        if (valorEmprestadoEmpresa <= 25000 && valorEmprestadoEmpresa > 0) {
            valor = valorEmprestadoEmpresa;
            System.out.println("O valor de " + valorEmprestadoEmpresa + " Reais foi depositado com sucesso!");
        } else{
            System.out.println("!Erro!");
        }
    }

    public void creditarClienteEmpresa(){
        
        if(valorDevolucaoEmpresa <= valorEmprestadoEmpresa && valorDevolucaoEmpresa > 0){
            valor = valorEmprestadoEmpresa - valorDevolucaoEmpresa;
        System.out.println("Devolução Realizada com Sucesso!");
    
    }else{
        System.out.println("!Erro!");
    }
    }

 
}
