/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.easyapp.roadmapsh;

import Carro.Carro;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Roadmapsh {
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        Carro2 c1 = new Carro2("Versa",001);
        System.out.println(c1.ler());
        
        /*Se o arquivo de classe for encontrado, o Java carrega a classe em 
        memória e retorna um objeto Class que representa a classe carregada. 
        Esse objeto Class contém informações sobre a classe, como seu nome, 
        pacote, métodos e campos. Usado com reflexão: examinar e manipular obj
        em tempo de execução.
        */        
        Class<Carro> minhaClasse = (Class<Carro>) Class.forName("Carro.Carro");
        //construtor com argumentos
        Constructor<Carro> construtorCarro = minhaClasse.getDeclaredConstructor(String.class, int.class);
        //nova instancia da classe
        Carro c2 = construtorCarro.newInstance("Ka", 002);
        System.out.println(c2.ler());
        
        try {
            Carro c3 = (Carro) c2.clone();
            System.out.println(c3.ler());
        } catch (CloneNotSupportedException e) {
            // Trata a exceção aqui, por exemplo:
            e.getStackTrace();
        }      
    }
}
