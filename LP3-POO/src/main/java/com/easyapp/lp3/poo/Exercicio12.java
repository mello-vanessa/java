/*
12. Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes
operações:
a. void armazenarPessoa(String nome, int idade, float altura); //armazena a pessoa em um array
b. void removerPessoa(String nome); //remove a pessoa do array
c. int buscarPessoa(String nome); // informa em que posição da agenda está a pessoa
d. void imprimirAgenda(); // imprime os dados de todas as pessoas da agenda
e. void imprimirPessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.
 */
package com.easyapp.lp3.poo;

public class Exercicio12 {
    
    private String[] nomes;
    private int[] idades;
    private float[] alturas;
    private int indice;
    
    public Exercicio12(){
        this.nomes = new String[10];
        this.idades = new int [10];
        this.alturas = new float[10];
        this.indice = 0;
    }
    
    public void armazenarPessoa(String nome, int idade, float altura){
        if(this.indice < 10){
            this.nomes[indice] = nome;
            this.idades[indice] = idade;
            this.alturas[indice] = altura;
            indice++;
            System.out.printf("Pessoa %s adicionada com sucesso.\n", nome);
        }
        else{
            System.out.println("Agenda lotada\n");
        }
    }
    
    public void removerPessoa(String nome){
        for(int i=0; i<this.indice;i++){
            if(this.nomes[i].equalsIgnoreCase(nome)){
                //Mover o que tá na posição por ex 03 para a 02
                for(int j=i;j<this.indice-1; j++){
                    this.nomes[j] = this.nomes[j+1];
                    this.idades[j] = this.idades[j+1];
                    this.alturas[j] = this.alturas[j+1];
                }
                //deixa a última posicao nula
                this.nomes[indice-1] = null;
                this.idades[indice-1] = 0;
                this.alturas[indice-1] = 0.0f;
                System.out.printf("Pessoa %s removida.\n", nome);
                //Apaga o último indice
                indice--;
                return;
            }
            else{
                System.out.printf("Pessoa %s não encontrada na agenda.\n", nome);
            }
        }
    }
    
    public int buscarPessoa(String nome){
        for(int i=0;i<this.indice;i++){
            if(this.nomes[i].equalsIgnoreCase(nome)){
                return i;
            }
        }
        return -1;
    }
    
    public void imprimirAgenda(){
        if(this.indice == 0){
            System.out.println("Agenda vazia.\n");
        }
        else{
            for(int i=0;i<this.indice;i++){
                System.out.println("Pessoa "+(i+1)+"\nNome: "+this.nomes[i]+""
                        + "\nIdade: "+this.idades[i]+"\nAltura: "
                        +this.alturas[i]);
            }

        }
    }
    
    public void imprimirPessoa(int index){
        if(index < 0 || index >= this.indice){
            System.out.println("Indice inválido.\n");
        }
        else{
            System.out.println("Pessoa "+(index+1)+"\nNome: "+this.nomes[index]+""
                + "\nIdade: "+this.idades[index]+"\nAltura: "
                +this.alturas[index]);
        }
    }
 
    
    public static void main(String[] args) {
        Exercicio12 e12 = new Exercicio12();
        e12.armazenarPessoa("Vanessa Mello", 37, 1.71f);
        e12.armazenarPessoa("Cristian Cardoso", 34, 1.82f);
        e12.armazenarPessoa("Arthur Cardoso", 0, 0.60f);
        System.out.println("Indice da pessoa Cristian: "+e12.buscarPessoa("Cristian Cardoso"));
        e12.imprimirPessoa(0);
        e12.imprimirAgenda();
        e12.removerPessoa("Vanessa Mello");
        e12.imprimirAgenda();
        e12.imprimirPessoa(0);
    }
}