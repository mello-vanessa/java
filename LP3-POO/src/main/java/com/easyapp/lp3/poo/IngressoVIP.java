/*
 Crie uma classe chamada Ingresso, que possui um valor em reais e um método 
imprimirValor. Crie uma classe IngressoVIP, que herda de Ingresso e possui um 
valor adicional. Crie um método que retorne o valor do ingresso VIP (com o 
adicional incluído). Crie um programa para criar as instâncias de Ingresso e
IngressoVIP, mostrando a diferença de preços.
 */
package com.easyapp.lp3.poo;

public class IngressoVIP extends Ingresso{
    
    public IngressoVIP(float valor){
        super(valor+10f);
    }
    
    public static void main(String[] args) {
        IngressoVIP ivip = new IngressoVIP(5.0f);
        System.out.println(ivip.imprimirValor());
        Ingresso i = new Ingresso(5.0f);
        System.out.println(i.imprimirValor());
    }
}
