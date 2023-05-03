package com.easyapp.lp3.poo;

import java.util.Scanner;

public class Exercicio13Extended extends Exercicio13{
    
    //private double num1;
    //private double num2;
    
    public Exercicio13Extended(double num1, double num2){
        super(num1,num2);
    }
    
    public double RaizQuadrada(double num1){
        return Math.sqrt(num1);
    }
    
    public double Potencia(double num1, double num2){
        return Math.pow(num1, num2);
    }
  
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um num:");
        double numero1 =  teclado.nextDouble();
        System.out.println("Digite outro num:");
        double numero2 = teclado.nextDouble();
        Exercicio13Extended e13 = new Exercicio13Extended(numero1,numero2);
        try{
            System.out.println(numero1+"/"+numero2+"="+e13.divisao());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }        
        System.out.println("Raiz quadrada de "+numero1+"="+e13.RaizQuadrada(numero1));
        System.out.println(numero1+" sobre "+numero2+"="+e13.Potencia(numero1, numero2));
    }
    
}
