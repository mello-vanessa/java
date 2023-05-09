package ListasEncadeadas;

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
    
    public Integer Procurar(int valor){
        No noAtual = cabeca;
        while(noAtual != null){
            if(noAtual.valor == valor){
                return noAtual.valor;
            }
            noAtual = noAtual.ponteiroProximo;
        }
        return null;
    }
    
    public boolean Remover(int valor){
        /*
        no anterior  no atual  no atual.proximo
        | |  x |  -> | | x | -> | | x |
        */
        No nodeAnterior = cabeca;
        No nodeAtual = cabeca.ponteiroProximo;
        
        while(nodeAtual != null){
            if(nodeAtual.valor == valor){
                //ponteiro do anterior para de apontar para o atual e 
                // vai para o atual.proximo, apagando a referência do atual
                nodeAnterior.ponteiroProximo = nodeAtual.ponteiroProximo;
                return true;
            }
            nodeAnterior = nodeAtual;
            nodeAtual = nodeAtual.ponteiroProximo;
        }
        return false;
    }
    
    public void imprimir(){
        No noAtual = cabeca;
        while(noAtual != null){
            System.out.print(noAtual.valor+" ");
            noAtual = noAtual.ponteiroProximo;
        }
    }
    
    public int getTamanhoLista(){
        return this.tamanhoLista;
    }
}
