package com.easyapp.algoritmos;

public class recursao {

    public static int recursivo(int i){
        System.out.println(i);
        //caso base
        if(i<=1){
            return i;
        }
        // caso recursivo 
        else{
            return recursivo(i-1);
        }
    }

    public static void main(String[] args) {
        int i = 5;
        recursivo(i);
    }
}
