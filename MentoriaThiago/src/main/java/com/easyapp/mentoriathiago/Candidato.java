
package com.easyapp.mentoriathiago;

/**
classe de Candidato com nome, partido, sigla e número, 
ao realizar o voto, somar a quantidade votante dos candidatos;
 */
public class Candidato {
    private String nome;
    private String partido;
    private String sigla;
    private int numero;
    private int votos;

    public Candidato(String nome, String partido, String sigla, int numero) {
        this.nome = nome;
        this.partido = partido;
        this.sigla = sigla;
        this.numero = numero;
        this.votos = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getPartido() {
        return partido;
    }

    public String getSigla() {
        return sigla;
    }

    public int getNumero() {
        return numero;
    }

    public int getVotos(){
        return votos;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void addVotos(){
        votos++;
    }
}
