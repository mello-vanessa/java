
package com.easyapp.algoritmos;
import java.util.Arrays;

public class somaRecursao {
    
    public static int soma(int[] numeros){
        if(numeros.length == 0){
            return 0;
        }
        else{
            int primeiro = numeros[0];
            int[] resto = Arrays.copyOfRange(numeros, 1, numeros.length);
            return primeiro+soma(resto);
        }
    }
    
    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        System.out.println(soma(num));
    }

}
