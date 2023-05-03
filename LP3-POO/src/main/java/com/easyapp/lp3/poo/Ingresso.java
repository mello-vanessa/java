/*
 Crie uma classe chamada Ingresso, que possui um valor em reais e um método 
imprimirValor. Crie uma classe IngressoVIP, que herda de Ingresso e possui um 
valor adicional. Crie um método que retorne o valor do ingresso VIP (com o 
adicional incluído). Crie um programa para criar as instâncias de Ingresso e
IngressoVIP, mostrando a diferença de preços.
 */

package com.easyapp.lp3.poo;

public class Ingresso {

    private float valor;
    
    public Ingresso(float valor){
        this.valor = valor;
    }
    
    public float getValor(){
        return valor;
    }
    
    public void setValor(float valor){
        this.valor = valor;
    }
    
    public String imprimirValor(){
        return "O valor é R$: "+this.getValor();
    }
}
