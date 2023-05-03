package com.easyapp.roadmapsh;

public class Carro2 implements Cloneable{

    private String nome;
    private int codigo;

    public Carro2(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    protected String ler() {
        return "Carro{" + "nome=" + nome + ", codigo=" + codigo + '}';
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
