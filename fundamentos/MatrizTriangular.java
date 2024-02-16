package Estudos;

import java.util.Scanner;

/**
 *
 * @author vanessadeoliveiramello
 */
public class MatrizTriangular {

/*
String matriz[][] = new String[3][5]; 
Imprimir matriz:
- - x - -
- x x x -
x x x x x

Desenha a escada da esquerda pra direita
0 1 2 3 4
0 - - x - -
1 - - - x -
2 - - - - x
l+matriz[l].length/2= 0+2, coluna 2
l+matriz[l].length/2 = 1+2, preenche coluna 3
l+matriz[l].length/2 = 2+2, preenche coluna 4

Volta a escada preenche da direita pra esquerda
matriz[l].length/2 -> 5/2 = 2
linha 0: 0*2 --> i=0, não preenche nada, somente ficou já preenchida a l+matriz[l].length/2= 0+2, coluna 2
linha 1: 1*2 --> i=2, l+matriz[l].length/2 = 1+2, i=2, então preenche 2 para antes da coluna 3
linha 2: 2*2 --> i=4, l+matriz[l].length/2 = 2+2, i=4, então preenche 4 para antes da coluna 4

- - x - -
- x x x -
x x x x x

*/

public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.println("Digite o número de linhas: ");
    int linha = in.nextInt();
    System.out.println("Digite o número de colunas: ");
    int coluna = in.nextInt();
    String matriz[][] = new String[linha][coluna]; // declara matriz
    System.out.println("Gerando a matriz...");
    
    for(int l=0;l<matriz.length;l++){//tamanho da linha
        for(int c=0; c<matriz[l].length;c++){//tamanho da coluna
            if(c == l+matriz[l].length/2){//desenha a escada da esquerda pra direita, somente um item
                matriz[l][c] = "x";
                int i = l*2; //aqui volta a escada e preenche o resto da linha
                while(i>0){
                    matriz[l][c-i] = "x";
                    i--;
                }
            }
            else{
                matriz[l][c] = "-";
            }
        }
    }
    System.out.println("Imprimir matriz:");
    for(int l=0;l<matriz.length;l++){//tamanho da linha
        for(int c=0; c<matriz[l].length;c++){//tamanho da coluna
            System.out.print(matriz[l][c]+"\t");
        }
        System.out.println();
        }
    }
}
