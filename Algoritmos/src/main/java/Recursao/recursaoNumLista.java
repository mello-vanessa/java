
package Recursao;
import java.util.Arrays;
public class recursaoNumLista {
    public static int numeroItensArray(int[] num){
        if(num.length == 0){
            return 0;
        }
        else{
            return 1 + numeroItensArray(Arrays.copyOfRange(num, 1, num.length));
        }
    }
    
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9};
        System.out.println(numeroItensArray(num));
    }
}
