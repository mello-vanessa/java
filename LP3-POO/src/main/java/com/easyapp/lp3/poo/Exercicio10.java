
package com.easyapp.lp3.poo;
/*

10. Crie uma classe para representar um jogador de futebol, com os atributos: 
a. nome;
b. posição;
c. data de nascimento;  
d. nacionalidade;
e. altura;
f. peso;
Crie os métodos públicos necessários para getters e setters e também um método 
para imprimir todos os dados do jogador. Crie um método para calcular a idade do
jogador e outro método para mostrar quanto tempo falta para o jogador se 
aposentar. Para isso, considere que os jogadores da posição de defesa se 
aposentam em média aos 40 anos, os jogadores de meio-campo aos 38 e os atacantes
aos 35.
*/
import java.time.LocalDate;
import java.time.Period;

public class Exercicio10 {
    private String nome;
    private String posicao;
    private Exercicio08 dataNascimento;
    private String nacionalidade;
    private float altura;
    private float peso;
    
    public Exercicio10(String nome, String posicao, Exercicio08 dataNascimento,
    String nacionalidade, float altura, float peso){
        this.nome = nome;
        this.posicao = posicao;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }
    
    //getter
    public String getNome(){
        return nome;
    }
    public String getPosicao(){
        return posicao;
    }
    public Exercicio08 getDataNascimento(){
        return dataNascimento;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public float getAltura(){
        return altura;
    }
    public float getPeso(){
        return peso;
    }
    
    //setter
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPosicao(String posicao){
        this.posicao = posicao;
    }
    public void setDataNascimento(Exercicio08 dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public String Imprime(){
        return "Nome: "+this.getNome()+"\nPosição: "+this.getPosicao()+"\nData "
                + "de nascimento: "+this.getDataNascimento()+"\nNacionalidade: "
                +this.getNacionalidade()+"\nAltura: "+this.getAltura()+"\n"
                + "Peso: "+this.getPeso();
    }
    
    public int CalculaIdade(){
        
        if(LocalDate.now().getMonthValue()> this.getDataNascimento().getMes()
                || (this.getDataNascimento().getMes() == LocalDate.now().
                getMonthValue() && this.getDataNascimento().getDia() <= 
                LocalDate.now().getDayOfMonth())){
            return LocalDate.now().getYear()-this.getDataNascimento().getAno();
        }
        else{
            return LocalDate.now().getYear()-this.getDataNascimento().getAno()-1;
        }
    }
    
    public int TempoAposentadoria(){
        if(this.getPosicao().equalsIgnoreCase("Defesa")){
            return 40-this.CalculaIdade();
        }
        else if(this.getPosicao().equalsIgnoreCase("Meio-campo")){
            return 38-this.CalculaIdade();
        }
        else{
            return 35-this.CalculaIdade();
        }
    }
    
    public static void main(String[] args) {
        Exercicio10 e10 = new Exercicio10("Vanessa", "defesa", new Exercicio08(22, 07, 2002), "Brasileiro",
        1.82f, 80f);
        System.out.println(e10.Imprime());
        System.out.println("Idade: "+e10.CalculaIdade());
        int tempoAposentadoria = e10.TempoAposentadoria();
        if(tempoAposentadoria < 0){
            System.out.printf("O jogador %s já está aposentado.\n", e10.getNome());
        }
        else{
            System.out.println("Tempo que falta para aposentadoria: "+tempoAposentadoria);
        }
    }
}
