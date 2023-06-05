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
public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();        
        bst.adicionaNo(5);
        bst.adicionaNo(3);
        bst.adicionaNo(8);
        bst.adicionaNo(2);
        bst.adicionaNo(4);
        bst.adicionaNo(7);
        bst.adicionaNo(9);
        bst.percorreOrdemNumerica();
        bst.precorrePreOrdem();
        bst.percorrePosOrdem();
    }
 
}
