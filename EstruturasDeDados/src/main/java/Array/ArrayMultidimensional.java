package Array;

/**
 *
 * @author vanessadeoliveiramello
 */
public class ArrayMultidimensional {
    private int array[][];
    private int altura;
    private int largura;
    
    public ArrayMultidimensional(int altura, int largura){
        this.array = new int[altura][largura];
    }
    
    public int adicionaElemento(int valor, int altura, int largura){
        return this.array[altura][largura] = valor;
    }
    
    public void retornaArray(){
/*
    for(int i=0; i<this.array.length;i++){
        for(int j=0; j<this.array.length;j++){
            System.out.println(this.array[i][j]+ "\t");
        }
    }
*/
        for (int[] array1 : this.array) {
            for (int j = 0; j<this.array.length; j++) {
                System.out.println(array1[j] + "\t");
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(); // Quebra de linha após cada linha
        }
    }
}
