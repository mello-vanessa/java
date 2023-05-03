package com.easyapp.lp3.poo;

/**
Crie uma classe Calculadora. Esta classe deve implementar as operações básicas 
* (soma, subtração, divisão e multiplicação). Utilizando o conceito de herança 
* crie uma classe chamada calculadora cientifica que implementa os seguintes 
* cálculos: raizQuadrada e a potencia. Dica utilize a classe Math do pacote 
* java.lang.
 */

public class Exercicio13 {

    private double num1;
    private double num2;

    public Exercicio13(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double soma(){
        return num1+num2;
    }
    
    public double subtracao(){
        return num1-num2;
    }
    
    public double multiplicação(){
        return num1*num2;
    }
    
    protected double divisao(){
        if(num2==0){
            throw new IllegalArgumentException("Divisão por zero não permitida.");
        }
        return num1/num2;
    }
}
