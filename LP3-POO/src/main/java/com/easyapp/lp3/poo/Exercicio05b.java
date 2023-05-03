
package com.easyapp.lp3.poo;

import java.util.Scanner;
/**
5. Escreva uma classe cujos objetos representam alunos matriculados em uma 
disciplina. Cada objeto dessa classe deve guardar os seguintes dados do aluno:
matrícula, nome, 2 notas de prova e 1 nota de trabalho. Escreva os seguintes 
* métodos para esta classe:
media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem 
* peso 2)
final: calcula quanto o aluno precisa para a prova final (retorna zero se ele 
não for para a final)
 */
public class Exercicio05b {
 
    private int matricula;
    private String nome;
    private float prova01;
    private float prova02;
    private float trabalho01;
    
    public Exercicio05b(){
    }
    
    public Exercicio05b(int matricula, String nome, float prova01, float 
            prova02,float trabalho01){
        this.matricula = matricula;
        this.nome = nome;
        this.prova01 = prova01;
        this.prova02 = prova02;
        this.trabalho01 = trabalho01;
    }
    
    //getters
    public int getMatricula(){
        return matricula;
    }
    public String getNome(){
        return nome;
    }
    
    public float getProva01(){
        return prova01;
    }
    
    public float getProva02(){
        return prova02;
    }
    
    public float getTrabalho01(){
        return trabalho01;
    }
    
    //setters
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setProva01(float prova01){
        this.prova01 = prova01;
    }

    public void setProva02(float prova02){
        this.prova02 = prova02;
    }
    
    public void setTrabalho01(float trabalho01){
        this.trabalho01 = trabalho01;
    }

    public float calcularMedia(){
        //como 2.5+2.5+2 = 7, o cálculo da média fica dividindo por 7
        return (this.getProva01()*2.5f+this.getProva02()*2.5f+this.getTrabalho01()*2)/7;
    }
    
    public float calcularFinal(){
        if(this.calcularMedia()>=7){
            return 0;
        }
        else{
            return 7-this.calcularMedia();
        }
    }
    
    public static void main(String[] args) {
        Exercicio05b e05b = new Exercicio05b();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        e05b.setNome(teclado.nextLine());
        System.out.println("Digite o número da matrícula: ");
        e05b.setMatricula(teclado.nextInt());
        System.out.println("Digite a nota da prova 01:");
        e05b.setProva01(teclado.nextFloat());
        System.out.println("Digite a nota da prova 02:");
        e05b.setProva02(teclado.nextFloat());
        System.out.println("Digite a nota do trabalho 01:");
        e05b.setTrabalho01(teclado.nextFloat());
        System.out.printf("Média do aluno %s: %.2f", e05b.getNome(), 
                e05b.calcularMedia());
        if(e05b.calcularFinal() == 0){
            System.out.printf("\nAluno %s passou por média.", 
                    e05b.getNome());
        }
        else {
            System.out.printf("\nFaltam %.2f para o aluno %s passar de ano."
                    + "", e05b.calcularFinal(), e05b.getNome());
        }
    }
}
