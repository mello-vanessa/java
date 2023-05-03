package com.easyapp.lp3.poo;

/**
 Escreva uma classe em que cada objeto representa um Voo que acontece em 
 * determinada data e em determinado horário. Cada vôo possui no máximo 100 
 * passageiros, e a classe permite controlar a ocupação das vagas. A classe deve
 * ter os seguintes métodos:
a. Construtor: configura os dados do vôo (recebidos como parâmetro): número do 
* vôo, data (para armazenar a data utilize um objeto da classe Data, criada na 
* questão anterior);
b. ProximoLivre: retorna o número da próxima cadeira livre
c. Verifica: verifica se o número da cadeira recebido como parâmetro está 
* ocupada
d. Ocupa: ocupa determinada cadeira do vôo, cujo número é recebido como 
* parâmetro, e retorna
verdadeiro se a cadeira ainda não estiver ocupada (operação foi bem sucedida) e 
* falso caso
contrário
e. Vagas: retorna o número de cadeiras vagas disponíveis (não ocupadas) no vôo
f. GetVoo: retorna o número do vôo
 */

public class Exercicio09 {
    
    private int numVoo;
    private Exercicio08 data;
    private boolean[] listaAssentos;
    private int numAssento;

    public Exercicio09(int numVoo, Exercicio08 data) {
        this.numVoo = numVoo;
        this.data = data;
        this.listaAssentos = new boolean [100];
        this.numAssento = 0;
    }

    public int getNumVoo() {
        return numVoo;
    }

    public Exercicio08 getData() {
        return data; 
    }

    public void setNumVoo(int numVoo) {
        this.numVoo = numVoo;
    }

    public void setData(Exercicio08 data) {
        this.data = data;
    }  
      
    public boolean Verifica(int numAssento){
        if(this.listaAssentos[numAssento-1]){
            return true;
        }
        if(numAssento<0 || numAssento>100){
            return false;
        }
        else{
            return false;
        }
    }
    
    public boolean Ocupa(int numAssento){
        if(!this.Verifica(numAssento)){
            //false, desocupado
            this.listaAssentos[numAssento-1] = true;
            return true;            
        }
        else{
            return false;
        }
    }
    
    public int ProximoLivre(int numAssento){
        for(int i = numAssento; i<this.listaAssentos.length; i++){
            if(!this.Verifica(i)){
                return i;
            }
        }
        //se todos estiverem ocupados
        return -1;
    }
    
    public int Vagas(){
        int count=0;
        for(int i=0;i<this.listaAssentos.length;i++){
            if(!this.Verifica(i+1)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Exercicio09 e09 = new Exercicio09(747,new Exercicio08(30, 12, 2024));
        System.out.println(e09.getNumVoo());
        System.out.println(e09.Verifica(10));
        System.out.println(e09.Ocupa(10));
        System.out.println(e09.Verifica(10));
        System.out.println(e09.ProximoLivre(10));
        System.out.println(e09.Vagas());
    }

}

