package com.easyapp.algoritmos;

import java.util.Arrays;

/*
Este código inicia com um array desordenado de inteiros, então chama o método 
quickSort passando o array e os índices inicial e final do array como parâmetros. 
O método quickSort é uma implementação recursiva do algoritmo QuickSort. Ele 
primeiro verifica se o índice inicial é menor que o índice final. Se for, chama 
o método partition para dividir o array em duas partes e chama novamente o 
quickSort para ordenar as duas partes. O método partition é responsável por 
escolher um elemento de pivô e dividir o array em duas partes com elementos 
menores que o pivô à esquerda e elementos maiores à direita. No final, o método 
partition retorna o índice do elemento pivô, que é usado para dividir o array 
nas próximas chamadas recursivas do quickSort.

O resultado da ordenação é impresso na tela usando System.out.println(Arrays.toString(arr)).
*/
public class QuickSort {

  public static void main(String[] args) {
    int[] arr = {7, 2, 1, 6, 8, 5, 3, 4};
    quickSort(arr, 0, arr.length-1);
    System.out.println(Arrays.toString(arr));
  }

  public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int partitionIndex = partition(arr, low, high);
      quickSort(arr, low, partitionIndex-1);
      quickSort(arr, partitionIndex+1, high);
    }
  }

  public static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    System.out.println(arr[high]);
    int i = low-1;
    for (int j = low; j < high; j++) {
      if (arr[j] < pivot) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp;
    return i+1;
  }
}
