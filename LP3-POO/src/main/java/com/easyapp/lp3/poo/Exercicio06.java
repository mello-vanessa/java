package com.easyapp.lp3.poo;
/*
6. Crie uma classe chamada Invoice que possa ser utilizado por uma loja de 
suprimentos de informática para representar uma fatura de um item vendido na 
loja. Uma fatura deve incluir as seguintes informações como atributos:			 							
-> o número do item faturado			 							
-> a descrição do item		 							
-> a quantidade comprada do item
-> o preço unitário do item.
Sua classe deve ter um construtor que inicialize os quatro atributos. Se a 
quantidade não for positiva, ela deve ser configurada como 0. Se o preço por 
item não for positivo ele deve ser configurado como 0.0. Forneça os métodos 
getters e setters para cada variável de instância. Além disso, forneça um método
chamado getInvoiceAmount que calcula o valor da fatura (isso é, multiplica a 
quantidade pelo preço por item) e depois retorna o valor como um double. 
Escreva um aplicativo de teste que demonstra as capacidades da classe Invoice.
*/

public class Exercicio06 {
    
    private int numItemFaturado;
    private String descricaoItem;
    private int quantidadeCompradaItem;
    private float precoUnitarioItem;

    public Exercicio06(int numItemFaturado, String descricaoItem, int quantidadeCompradaItem, float precoUnitarioItem) {
        this.numItemFaturado = numItemFaturado;
        this.descricaoItem = descricaoItem;
        if(this.quantidadeCompradaItem < 0){
            this.quantidadeCompradaItem = 0;
        }
        else{
            this.quantidadeCompradaItem = quantidadeCompradaItem;
        }
        if(this.precoUnitarioItem < 0){
            this.precoUnitarioItem = 0.0f;
        }
        else{
            this.precoUnitarioItem = precoUnitarioItem;
        }
    }

    //getter
    public int getnumItemFaturado(){
        return numItemFaturado;
    }
    
    public String getDescricaoItem(){
        return descricaoItem;
    }
    
    public int getQuantidadeCompradaItem(){
        return quantidadeCompradaItem;
    }
    
    public float getPrecoUnitarioItem(){
        return precoUnitarioItem;
    }
    
    //setter
    
    public void setnumItemFaturado(int numItemFaturado){
        this.numItemFaturado = numItemFaturado;
    }
    
    public void setDescricaoItem(String descricaoItem){
        this.descricaoItem = descricaoItem;
    }
    
    public void setQuantidadeCompradaItem(int quantidadeCompradaItem){
        this.quantidadeCompradaItem = quantidadeCompradaItem;
    }
    
    public void setPrecoUnitarioItem(float precoUnitarioItem){
        this.precoUnitarioItem = precoUnitarioItem;
    }
    
    public double getInvoiceAmount(){
        return (double) this.getQuantidadeCompradaItem() * this.getPrecoUnitarioItem();
    }
    
    public String gerarFatura(){
        return "Preço unitário ítem: "+this.getPrecoUnitarioItem()+"\n"
                + "Número ítem: "+this.getnumItemFaturado()+"\n"
                + "Descrição ítem: "+this.getDescricaoItem()+"\n"
                + "Valor total: "+this.getInvoiceAmount(); 
    }
    
    public static void main(String[] args) {
        Exercicio06 e06 = new Exercicio06(1010, "Fralda "
                + "Pampers", 2, 6.50f);
        System.out.println(e06.gerarFatura()); 
        
    }
}
