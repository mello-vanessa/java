
package com.easyapp.lp3.poo;

/**
Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel
* deve conter os seguintes atributos: tipo de combustível, valor por litro e 
* quantidade de combustível. Além desses atributos a classes deve conter os 
* seguintes métodos.
-> abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra 
a quantidade de litros que foi colocada no veículo
-> abastecerPorLitro; // método onde é informado a quantidade em litros de 
combustível e mostra o valor a ser pago pelo cliente.
- >alterarValor; //altera o valor do litro do combustível.
-> alterarCombustivel; //altera o tipo do combustível.
-> alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na 
* bomba.
*/

public class Exercicio03 {
  
    private char tipoCombustivel;
    private float valorLitro;
    private float quantidadeCombustivel;    
    
    public Exercicio03(char tipoCombustivel, float valorLitro, float 
            quantidadeCombustivel){
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }
    //getter
    public char getTipoCombustivel() {
        return tipoCombustivel;
    }

    public float getValorLitro() {
        return valorLitro;
    }

    public float getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }
    
    //setter
    public void alterarValor(float valorLitro){
        this.valorLitro = valorLitro;
    }
    
    public void alterarCombustivel(char tipoCombustivel){
        this.tipoCombustivel = tipoCombustivel;
    }
    
    public void alterarQuantidadeCombustivel(float quantidadeCombustivel){
        this.quantidadeCombustivel = quantidadeCombustivel;
    }
    //métodos próprios
    public float abastecerPorValor(float valorAbastecimento){
        return valorAbastecimento/valorLitro;
    }
    
    public float abastecerPorLitro(float quantidadeCombustivel){
        return quantidadeCombustivel*valorLitro;
    }
    
    public static void main(String[] args) {
    
        Exercicio03 e03 = new Exercicio03('G',2.0f, 10f);
        System.out.println("Total a ser pago: R$"+e03.abastecerPorLitro(15.0f));
        System.out.println("Tipo de combustível: "+e03.getTipoCombustivel());
        System.out.println(e03.abastecerPorValor(12.0f)+" litros abastecidos.");
        e03.alterarCombustivel('A');
        System.out.println("Tipo de combustível: "+e03.getTipoCombustivel());
    }
}
