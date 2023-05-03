
package com.easyapp.listasencadeadas;

/*
Explicação:
Primeiro, definimos a classe No, que representa um nó da lista encadeada. Cada nó contém um valor (representado por um inteiro) e uma referência para o próximo nó da lista (ou null, se for o último nó).
Em seguida, definimos a classe ListaEncadeada, que representa a própria lista encadeada. Ela contém uma referência para o primeiro nó da lista (ou null, se a lista estiver vazia).
O construtor da classe ListaEncadeada simplesmente inicializa a referência para o primeiro nó como null, indicando que a lista está vazia.
O método inserir(int valor) insere um novo nó contendo o valor especificado no final da lista encadeada. Se a lista estiver vazia, o novo nó é o primeiro nó da lista. Caso contrário, percorremos a lista até encontrar o último nó e o adicionamos como o próximo nó após ele.
O método imprimir() percorre a lista encadeada e imprime os valores de cada nó.
No método main(), criamos uma nova lista encadeada, inserimos três valores nela e imprimimos a lista resultante.

*/
public class No {
    int valor;
    No proximo;

    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}


