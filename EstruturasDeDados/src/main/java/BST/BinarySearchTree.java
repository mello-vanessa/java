package BST;

/**
 *
 * @author vanessadeoliveiramello
 */

    /* Binary tree
                5
             /    \
            3      8
           / \    / \
          2   4  7   9
    */
public class BinarySearchTree {
    public Node raiz;
    
    public BinarySearchTree(){
        this.raiz = null;
    }
    
    private Node adicionaNoRecursivamente(Node noAtual, int valor){
        if(noAtual == null){
            return new Node(valor);
        }
        else{
            //Se novo valor < atual, vai para esquerda:
            if(valor < noAtual.valor){
                noAtual.esquerda = this.adicionaNoRecursivamente(noAtual.esquerda, valor);
            }
            // Senão, vai para esquerda
            else{
                noAtual.direita = this.adicionaNoRecursivamente(noAtual.direita, valor);
            }
        }
        return noAtual;
    }
    public void adicionaNo(int valor){
        raiz = this.adicionaNoRecursivamente(raiz, valor);
    }
    
    //Percorre em ordem numérica, vai na esquerda, nó pai, direita:
    private void ordemNumerica(Node no){
        if(no != null){
            this.ordemNumerica(no.esquerda);
            System.out.println(no.valor);
            this.ordemNumerica(no.direita);
        }
    }
    
    public void percorreOrdemNumerica(){
        System.out.println("Ordem numérica: ");
        this.ordemNumerica(raiz);
    }
    
    //Percorre em pré ordem, ou seja, o pai e depois os filhos.
    private void preOrdem(Node no){
        if(no != null){
            System.out.println(no.valor);
            this.preOrdem(no.esquerda);
            this.preOrdem(no.direita);
        }
    }
    
    public void precorrePreOrdem(){
        System.out.println("Pré ordem: ");
        this.preOrdem(raiz);
    }
    
    //Percorre em pós ordem: os filhos e depois o pai.
    private void posOrdem(Node no){
        if(no != null){
            this.posOrdem(no.esquerda);
            this.posOrdem(no.direita);
            System.out.println(no.valor);
        }
    }
    
    public void percorrePosOrdem(){
        System.out.println("Pós ordem: ");
        this.posOrdem(raiz);
    }
}
