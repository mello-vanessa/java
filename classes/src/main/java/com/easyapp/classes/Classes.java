/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.easyapp.classes;
import java.util.Scanner;
/**
 *
 * @author vanessadeoliveiramello
 */
public class Classes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        System.out.println("Digite o peso:");
        p1.setPeso(teclado.nextFloat());
        System.out.println("Digite a altura:");
        p1.setAltura(teclado.nextFloat());
        
        System.out.printf("O IMC é: %.2f",p1.calculaIMC());
    }
}
