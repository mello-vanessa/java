
package com.easyapp.roadmapsh;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        String time;
        Scanner in = new Scanner(System.in);
        /*System.out.println("Digite o num do dia da semana.");
        int day = in.nextInt();
        switch(day){
            case 1,2,3,4,5 -> System.out.println("Dia da semana.");
            case 6,7 -> System.out.println("Findi.");
        }
        */
        
        //Nested switch
        System.out.println("Digite de 1 a 3 para ver o nome do funcionário: ");
        int funcId = in.nextInt();
        switch(funcId){
            case 1->System.out.println("Vanessa");
            case 2->System.out.println("Arthur");
            case 3->{
                System.out.println("Cristian.");
                in.skip("\\R?");
                System.out.println("Digite o cód do time: ");
                time = in.nextLine();
                switch(time){
                    case "IT"->System.out.println("Departamento de TI.");
                    case "admin"->System.out.println("Departamento de administração.");
                    default->System.out.println("Departamento não encontrado.");
                }
            }
            default->System.out.println("Funcionário não encontrado.");    
        }
    }
}
