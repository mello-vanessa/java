/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.easyapp.algoritmos;

/**
 *
 * @author vanessadeoliveiramello
 * Nesse exemplo, a função binarySearch recebe um array de inteiros array e um 
 * valor inteiro key que está sendo procurado no array. A função retorna a 
 * posição do valor no array, ou -1 se o valor não estiver no array.
 *  log2 n e a pesquisa simples é n.
 * notacao bigO:
 * log2 n --> O(log n)
 * n --> O(n)
 * 
 * O(log n):
 * Isso significa que, à medida que a lista aumenta, o tempo de execução do 
 * algoritmo aumenta muito lentamente. 
 * 
 * binarySearch: so em listas ordenadas
 */
public class BinarySearchExample {
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] < key) {
                low = mid + 1;
            } else if (array[mid] > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        
        return -1; // key não encontrado
    }
}

