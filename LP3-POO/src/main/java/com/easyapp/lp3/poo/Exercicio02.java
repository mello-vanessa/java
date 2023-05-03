
package com.easyapp.lp3.poo;

public class Exercicio02 {
    
/* Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os 
seguintes atributos: número da conta, nome do correntista e saldo. Os métodos 
são os seguintes: alterarNome, depósito e saque; No construtor, saldo é opcional
com valor default zero e os demais atributos são obrigatórios./*
*/
    private int numConta;
    private String nome;
    private float saldo;
    
    public Exercicio02(int numConta, String nome){
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = 0.0f;
    }
    
    public Exercicio02(int numConta, String nome, float saldo){
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }    
    
    public float deposito(float valor){
        this.saldo = this.saldo + valor;
        return this.getSaldo();
    }
    
    public String saque(float valor){
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return "Saldo: "+this.getSaldo();
        }
        else {
            return "Saldo insuficiente.";
        }
    }
    
    public static void main(String[] args) {
        Exercicio02 e2 = new Exercicio02(002233, "Vanessa Mello");
        System.out.println(e2.saque(10000.0f));
    }
}
