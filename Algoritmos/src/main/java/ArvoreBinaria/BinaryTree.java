package ArvoreBinaria;

public class BinaryTree {
    private Node root;

    private class Node {
        private final int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public BinaryTree() {
        this.root = null;
    }

    public void addNode(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }

    public void traverseInOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node != null) {
            //raiz começa na esquerda
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }
    }

    public void traversePreOrder() {
        preOrder(root);
    }
// vai no nó antes de ir nos filhos
    private void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void traversePostOrder() {
        postOrder(root);
    }
//vai nos filhos antes de ir no nó atual
    private void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.value + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.addNode(5);
        tree.addNode(3);
        tree.addNode(8);
        tree.addNode(2);
        tree.addNode(4);
        tree.addNode(7);
        tree.addNode(9);

        
        System.out.println("In-order traversal:");
        tree.traverseInOrder();

        System.out.println("\nPre-order traversal:");
        tree.traversePreOrder();

        System.out.println("\nPost-order traversal:");
        tree.traversePostOrder();
    }
}
    
