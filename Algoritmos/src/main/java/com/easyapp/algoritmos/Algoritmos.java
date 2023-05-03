/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.easyapp.algoritmos;

import static com.easyapp.algoritmos.BinarySearchExample.binarySearch;

/**
 *
 * @author vanessadeoliveiramello
 */
public class Algoritmos {

    public static void main(String[] args) {
       int[] array = {1, 3, 5, 7, 9};
        int key = 7;
        int result = binarySearch(array, key);
        
        if (result == -1) {
            System.out.println("O elemento " + key + " não está no array.");
        } else {
            System.out.println("O elemento " + key + " está na posição " + result + " do array.");
        }
    }    }

