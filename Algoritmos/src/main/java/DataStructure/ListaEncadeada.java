package DataStructure;

// Para ter uma lista de nós encadeados, preciso de um nó inicial e do tamanho 
// inicial da lista
public class ListaEncadeada {
    //cabeça, é o primeiro quadrinho com dados e o ponteiro pro próximo nó
    No cabeca;
    int tamanhoLista;
    
    public void adicionar(int valor){
        // crio um novo no
        No novoNo = new No();
        novoNo.valor = valor;
        novoNo.ponteiroProximo = null;
        // adiciono novo No na lista
        // se a lista ta vazia, o novo no é a cabeca
        if(cabeca == null){
            cabeca = novoNo;
            
        //senao percorre a lista e coloca no final
        } else{            
        //percorre assim: o no atual recebe a cabeça, o primeiro        
            No noAtual = cabeca;
        // depois enquanto o ultimo no nao for null, ele vai percorrendo a lista
            while(noAtual.ponteiroProximo != null){
        // ae o no atual vai recebendo o prox para ir iterando, é um for do array
        // so que de lista encadeada
                noAtual = noAtual.ponteiroProximo;
            }
            noAtual.ponteiroProximo = novoNo;
        }
        // incrementa porque ao contrario do array, ele nao tem tamanho definido
        tamanhoLista++;
    }
    
    public void imprimir(){
        No noAtual = cabeca;
        while(noAtual != null){
            System.out.println(noAtual.valor+" ");
            noAtual = noAtual.ponteiroProximo;
        }
    }
    
    public int getTamanhoLista(){
        return this.tamanhoLista;
    }
    
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);
        lista.imprimir();
        lista.getTamanhoLista();        
    }
}
