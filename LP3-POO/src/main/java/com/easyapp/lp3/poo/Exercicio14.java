package com.easyapp.lp3.poo;

/**
Crie uma classe em Java chamada Fatura para uma loja de suprimentos de 
informática. A classe deve
conter quatro atributos:
a. número (String);
b. descrição (String);
c. quantidade comprada de um item (int);
d. preço por item (double).
A classe deve ter um construtor e os métodos getters e setters. Além disso, 
forneça um método chamado getTotalFatura que calcula o valor da fatura e depois 
retorna o valor como um double. Se o valor não for positivo, ele deve ser 
alterado para 0. Se o preço por item não for positivo, ele deve ser alterado 
para 0. Escreva uma nova classe chamada FaturaTeste (que contenha o método 
main) que demonstre as capacidades da classe Fatura.
 */
public class Exercicio14 {
    private String numero;
    private String descricao;
    private int quantCompradaItem;
    private double precoPorItem;
    
    public Exercicio14(String numero, String descricao, int quantCompradaItem, double precoPorItem){
        this.numero = numero;
        this.descricao = descricao;
        this.quantCompradaItem = quantCompradaItem;
        if(precoPorItem<0){
            this.precoPorItem = 0.0;
        }
        else
        {
            this.precoPorItem = precoPorItem;
        }
    }
    
    //getters
    public String getNumero(){
        return numero;
    }
    public String getDescricao(){
        return descricao;
    }
    public int getQuantCompradaItem(){
        return quantCompradaItem;
    }
    public double getPrecoPorItem(){
        return precoPorItem;
    }
    
    //setters
    public void setNumero(String numero){
        this.numero = numero;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setQuantCompradaItem(int quantCompradaItem){
        this.quantCompradaItem = quantCompradaItem;
    }
    public void setPrecoPorItem(double precoPorItem){
        if(precoPorItem<0){
            this.precoPorItem = 0.0;
        }
        else{
            this.precoPorItem = precoPorItem;    
        }        
    }

    public double getTotalFatura(){
        double resultado = this.getPrecoPorItem()*this.getQuantCompradaItem();
        if(resultado<0){
            return 0;
        }
        else{
            return resultado;
        }
    }
    
    public static void main(String[] args) {
        Exercicio14 e14 = new Exercicio14("90", "Parafuso", 10, 5.00);
        System.out.println(e14.getDescricao());
        System.out.println(e14.getPrecoPorItem());
        System.out.println(e14.getTotalFatura());
        Exercicio14 e15 = new Exercicio14("80", "Prego", 1, -6.00);
        System.out.println(e15.getDescricao());
        System.out.println(e15.getPrecoPorItem());
        System.out.println(e15.getTotalFatura());
    }
}
