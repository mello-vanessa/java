/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.easyapp.heranca;

/**
 *
 * @author vanessadeoliveiramello
 */
public class Heranca {

    public static void main(String[] args) {
        Vendedor zico = new Vendedor();
        zico.setNome("Adalberto");
        System.out.println("O nome é "+zico.getNome());
        
        Motorista m = new Motorista();
        m.setNome("pitocossauro");
        System.out.println(m.getNome());
    }
}
