
package com.easyapp.lp3.poo;

public class Pessoa {
  
    private String[] nomes;
    private int[] idades;
    private int indice;
    
    public Pessoa(){
        this.nomes = new String[5];
        this.idades = new int[5];
        this.indice = 0;
    }
    
    public void AdicionaPessoa(String nome, int idade){
        if(indice<5){
            this.nomes[indice] = nome;
            this.idades[indice] = idade;
            indice++;
        }
        else{
            System.out.println("Agenda lotada.\n");
        }
    }
    
    public void RemovePessoa(String nome){
        for(int i=0; i<this.indice;i++){
            //Acha a pessoa
            if(this.nomes[i].equalsIgnoreCase(nome)){
                //Sobreescreve o array puxando por cima do que quero apagar
                //por ex apagar vanessa na posicao 1 com array de 0 a 3, puxa o q ta 
                //no 2 para o 1 e o 3 para o 2
                for(int j=i; i<this.indice;j++){
                    //aqui o 1 recebe o 2 por ex
                    this.nomes[j]=this.nomes[j+1];  
                    this.idades[j]=this.idades[j+1];
                }
                //apaga o indice 3
                indice--;
                return;
            }
            else{
                System.out.printf("Pessoa %s não encontrada na agenda.", nome);
            }
        }
    }
}
