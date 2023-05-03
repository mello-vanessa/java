package com.easyapp.meuprimeiroprojeto;

import java.util.Scanner;

public class MeuPrimeiroProjeto {

    /*
    Faça um algoritmo que receba o preço de custo e o preço de venda de 40 
    produtos. Mostre como resultado se houve lucro, prejuízo ou empate para cada
    produto. Informe o valor de custo de cada produto, o valor de venda de cada 
    produto, a média de preço de custo e do preço de venda;
    */
    
public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        float somaCusto = 0;
        float somaVenda = 0;
        float pCusto;
        float pVenda;
        float mediaCusto;
        float mediaVenda;
        int i;
        for(i=0; i<2; i++){ 
            System.out.println("Preço custo: ");
            pCusto = leia.nextFloat();
            System.out.println("Preço venda: ");
            pVenda = leia.nextFloat();
            somaCusto += pCusto;
            somaVenda += pVenda;
            if(pCusto > pVenda) {
                System.out.println("Prejuízo.");
            }
            else if(pCusto == pVenda){
                System.out.println("Empate.");
            }
            else {
                System.out.println("Lucro.");
            }
        }
        mediaCusto = somaCusto/i;
        mediaVenda = somaVenda/i;
        System.out.printf("Média de venda: %.2f \nMédia de custo: %.2f", mediaVenda, mediaCusto);
        
    }
}
