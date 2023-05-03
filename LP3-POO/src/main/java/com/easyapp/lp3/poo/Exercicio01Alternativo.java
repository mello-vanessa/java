/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.easyapp.lp3.poo;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author vanessadeoliveiramello
 */
public class Exercicio01Alternativo {
    
    private String nome;
    private LocalDate dataNascimento;
    private float altura;

    public Exercicio01Alternativo() {
    }
    
    //getter
    public String getNome(){
        return this.nome;
    }
    
    public LocalDate getDataNascimento(){
        return this.dataNascimento;
    }
    
    public float getAltura(){
        return this.altura;
    }
    
    //setter
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public int getIdade(){
        /*LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(this.dataNascimento, hoje);
        return periodo.getYears();
        */
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }
    
    public static void main(String[] args) {
        Exercicio01Alternativo oi = new Exercicio01Alternativo();
        LocalDate dataNascimento = LocalDate.of(1959, 3, 21);
        oi.setDataNascimento(dataNascimento);
        System.out.println("Idade: " + oi.getIdade()); 
    }
}
