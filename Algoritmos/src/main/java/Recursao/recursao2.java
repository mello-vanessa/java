
package Recursao;

import java.util.Scanner;
public class recursao2 {
    
    public static int fatorial(int i){
        //caso base
        if(i==0){
            return 1;
        }
        //caso recursivo
        else{
            return i*fatorial(i-1);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Faça fatorial, digite um número:");
        int i = teclado.nextInt();
        System.out.println("====Fatorial====");
        System.out.println(fatorial(i));
    }
}
