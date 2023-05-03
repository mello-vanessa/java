package com.easyapp.algoritmos;

public class recursaoFatorial {

    public static int fatorial(int i){
        //caso base
        if(i==0){
            return 1;
        }
        else{
            //caso recursivo
            return i*fatorial(i-1);
        }
    }
    public static void main(String[] args) {
        int i = 5;
        System.out.println(fatorial(i));
    }
}
