/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graph;

/**
 *
 * @author vanessadeoliveiramello
 */
//import com.mxgraph.layout.mxCompactTreeLayout;
//import com.mxgraph.swing.mxGraphComponent;
//import com.mxgraph.view.mxGraph;

import javax.swing.*;

public class Grafo {
    private int V; // número de vértices
    private java.util.List<java.util.List<Integer>> adj; // lista de adjacência

    public Grafo(int V) {
        this.V = V;
        adj = new java.util.ArrayList<>(V);
        for (int i = 0; i < V; ++i)
            adj.add(new java.util.LinkedList<>());
    }

    // Adiciona uma aresta entre dois vértices
    public void adicionarAresta(int v1, int v2) {
        adj.get(v1).add(v2);
        adj.get(v2).add(v1);
    }

    // Imprime os vértices adjacentes de um determinado vértice
    public void imprimirAdjacentes(int v) {
        for (Integer adjacente : adj.get(v))
            System.out.print(adjacente + " ");
        System.out.println();
    }

    // Desenha o grafo usando JGraphX
    public void desenharGrafo() {
        mxGraph graph = new mxGraph();
        Object parent = graph.getDefaultParent();

        graph.getModel().beginUpdate();
        try {
            Object[] vertices = new Object[V];

            for (int i = 0; i < V; i++) {
                vertices[i] = graph.insertVertex(parent, null, String.valueOf(i), 20 + i * 80, 20, 40, 40);
            }

            for (int i = 0; i < V; i++) {
                for (Integer adjacente : adj.get(i)) {
                    graph.insertEdge(parent, null, null, vertices[i], vertices[adjacente]);
                }
            }

            mxCompactTreeLayout layout = new mxCompactTreeLayout(graph);
            layout.setHorizontal(false);
            layout.execute(parent);
        } finally {
            graph.getModel().endUpdate();
        }

        JFrame frame = new JFrame("Grafo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mxGraphComponent graphComponent = new mxGraphComponent(graph);
        frame.getContentPane().add(graphComponent);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Grafo grafo = new Grafo(5);

        grafo.adicionarAresta(0, 1);
        grafo.adicionarAresta(0, 4);
        grafo.adicionarAresta(1, 2);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(1, 4);
        grafo.adicionarAresta(2, 3);
        grafo.adicionarAresta(3, 4);

        grafo.desenharGrafo();
    }
}

