package com.easyapp.mentoriathiago;

public class Eleitor {

    private String nome;
    private int tituloEleitor;
    private int sessao;
    
    public Eleitor(String nome, int tituloEleitor, int sessao){
        this.nome = nome;
        this.tituloEleitor = tituloEleitor;
        this.sessao = sessao;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getTituloEleitor(){
        return tituloEleitor;
    }
    
    public int getSessao(){
        return sessao;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setTituloEleitor(int tituloEleitor){
        this.tituloEleitor = tituloEleitor;
    }
    
    public void setSessao(int sessao){
        this.sessao = sessao;
    }
    
    
}
