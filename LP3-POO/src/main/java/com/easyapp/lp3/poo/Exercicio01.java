package com.easyapp.lp3.poo;

import java.util.Calendar;
import java.util.Date;

/**
 Crie uma classe para representar uma Pessoa com os atributos privados de nome, 
 * data de nascimento e altura. Crie os métodos públicos necessários para 
 * getters e setters e também um método para imprimir todos dados de uma pessoa.
 * Crie um método para calcular a idade da pessoa.
 */
public class Exercicio01 {
    private String nome;
    private Date dataNascimento;
    private float altura;
    
    //construtor
    public Exercicio01(){
    }
    
    //getter
    public String getNome(){
        return this.nome;
    }
    
    public Date getDataNascimento(){
        return this.dataNascimento;
    }
    
    public float getAltura(){
        return this.altura;
    }
    
    //setter
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    /*
    * Crie um método para imprimir todos dados de uma pessoa.
    * Crie um método para calcular a idade da pessoa
    */
    
    public void imprimir(){
        System.out.println("Nome: "+this.getAltura()+"\nData de nascimento: "
                +this.getDataNascimento()+"\nAltura:"+this.getAltura()); 
    }
    
    public int calcularIdade(){
        Calendar hoje = Calendar.getInstance();
        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.setTime(this.dataNascimento);
        
        int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);
        
        if(hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)){
            idade--;
        } else if(hoje.get(Calendar.MONTH) > dataNascimento.get(
                Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) > 
                dataNascimento.get(Calendar.DAY_OF_MONTH)){
            idade --;
        }
        return idade;
    }
    
    public static void main(String[] args) {
        Exercicio01 p1 = new Exercicio01();
        Date dataNascimento = new Date(85, 7, 22);
        p1.setDataNascimento(dataNascimento);
        System.out.println(p1.calcularIdade()); 
    }
}



