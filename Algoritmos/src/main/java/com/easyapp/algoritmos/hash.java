/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.easyapp.algoritmos;
import java.util.HashMap;

/**
 *
 * @author vanessadeoliveiramello
 */
public class hash {
    private HashMap<String,Float> caderno;
    private int tamanho;
    
    public hash(int tamanho){
        this.caderno = new HashMap<>(tamanho);
    }
    
    public void addHashes(String indice, float valor){
        this.caderno.put(indice, valor);
    }
    
    public HashMap print(){
        return caderno; 
    }
    
    public static void main(String[] args) {
        hash h1 = new hash(3);
        h1.addHashes("maçã", 0.6f);
        h1.addHashes("banana", 2.6f);
        h1.addHashes("uva", 4.2f);
        System.out.println(h1.caderno.size());
        System.out.println(h1.print());
    }
}

