package AlgoritmosDiversos;
import java.util.HashMap;

/**
 *
 * @author vanessadeoliveiramello
 * 
 * Tabelas hash: Estruturas de dados de chave-valor. Aqui foi inserida uma String
 * e retornada um valor
 */
public class hash {
    private HashMap<String,Float> caderno;
    private int tamanho;
    
    public hash(int tamanho){
        this.caderno = new HashMap<>(tamanho);
    }
    
    public void addHashes(String indice, float valor){
        this.caderno.put(indice, valor);
    }
    
    public HashMap print(){
        return this.caderno; 
    }
    
    public int size(){
        return this.caderno.size();
    }
    
    public static void main(String[] args) {
        hash h1 = new hash(3);
        h1.addHashes("maçã", 0.6f);
        h1.addHashes("banana", 2.6f);
        h1.addHashes("uva", 4.2f);
        System.out.println("Tamanho do HashMap: "+h1.size());
        System.out.println("Caderno: "+h1.print());
    }
}

