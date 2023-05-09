package ListasEncadeadas;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);
        lista.imprimir();
        System.out.println("Tamanho da lista: "+lista.getTamanhoLista()); 
        System.out.println("O 9 existe? "+lista.Procurar(9));
        System.out.println("É possível remover o 2? "+lista.Remover(2)); 
        lista.imprimir();
    }
}
