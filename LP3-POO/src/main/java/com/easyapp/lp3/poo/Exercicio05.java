
package com.easyapp.lp3.poo;

public class Exercicio05 {
    
/*
Crie uma classe denominada Elevador para armazenar as informações de um elevador
dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total 
de andares no prédio (desconsiderando o térreo), capacidade do elevador e 
quantas pessoas estão presentes nele. A classe deve também disponibilizar os 
seguintes métodos:
-> Inicializa: que deve receber como parâmetros a capacidade do elevador e o 
    total de andares no prédio (os elevadores sempre começam no térreo e vazio);
-> Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda 
    houver espaço);
-> Sai: para remover uma pessoa do elevador (só deve remover se houver alguém 
    dentro dele);
-> Sobe: para subir um andar (não deve subir se já estiver no último andar);
-> Desce: para descer um andar (não deve descer se já estiver no térreo);     
*/    
    
    private int andar;
    private int totalAndares;
    private int capacidadeElevador;
    private int quantidadePessoas;

    //getter
    public int getAndar(){
        return andar;
    }

    public int getTotalAndares() {
        return totalAndares;
    }
    
    public int getCapacidadeElevador(){
        return capacidadeElevador;
    }
    
    public int getQuantidadePessoas(){
        return quantidadePessoas;
    }
    
    //setter
    
    public void setAndar(int andar){
        this.andar = andar;
    }
    
    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }    
    
    public void setCapacidadeElevador(int capacidadeElevador){
        this.capacidadeElevador = capacidadeElevador;
    }
    
    public void setQuantidadePessoas(int quantidadePessoas){
        this.quantidadePessoas = quantidadePessoas;
    }
    
    public void inicializar(int capacidadeElevador, int totalAndares){
        this.setAndar(0);
        this.setQuantidadePessoas(0);
        this.setCapacidadeElevador(capacidadeElevador);
        this.setTotalAndares(totalAndares);
    }
    
    public void entrar(){
        
        if(this.getCapacidadeElevador() > this.getQuantidadePessoas()){
            this.quantidadePessoas++;
            System.out.println("Entrou 1 pessoa. Quantidade de pessoas: "+this.getQuantidadePessoas());
        }
        else{
            this.getQuantidadePessoas();
            System.out.println("Capacidade máxima atingida.");
        }
    }
    
    public void sair(){
        if(this.getQuantidadePessoas() > 0){
            this.quantidadePessoas--;
            System.out.println("Saiu 1 pessoa. Quantidade de pessoas: "+this.getQuantidadePessoas());
        }
        else{
            this.getQuantidadePessoas();
            System.out.println("Elevador vazio.");
        }
    }

    public void subir(){
        if(this.getTotalAndares() > this.getAndar()){
            this.andar++;
            System.out.println("Subiu 1 andar. Andar: "+this.getAndar());
        }
        else{
            this.getAndar();
            System.out.println("Elevador já está no último andar.");
        }
    }
    
    public void descer(){
        if(this.getAndar() > 0){
            this.andar--;
            System.out.println("Desceu 1 andar. Andar: "+this.getAndar());
        }
        else{
            this.getAndar();
            System.out.println("Elevador já está no térreo.");
        }    
    }
    
    public static void main(String[] args) {
        Exercicio05 e05 = new Exercicio05();
        e05.inicializar(1, 2);        
        e05.subir();
        e05.descer();
        e05.descer();
        e05.subir();
        e05.subir();
        e05.subir();        
        e05.entrar();
        e05.sair();
        e05.sair();
        e05.entrar();

    }
}
