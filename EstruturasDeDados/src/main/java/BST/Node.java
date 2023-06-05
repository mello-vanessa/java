package BST;

/**
 *
 * @author vanessadeoliveiramello
 */
public class Node {
    public int valor;
    public Node esquerda;
    public Node direita;
    
    public Node(int valor){
        this.valor = valor;
        this.esquerda = this.direita = null;
    }
}
