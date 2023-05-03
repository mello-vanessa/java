package com.easyapp.lp3.poo;

/*
Introduza na classe Funcionario uma variável de classe capaz de contabilizar o 
numero de funcionarios que passaram pela empresa até a data.
*/

public class Exercicio15 {
    
    private String nome;
    private String sobrenome;
    private float salario;
    private int numFuncionarios = 0;
    
    public Exercicio15(String nome, String sobrenome, float salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        if(salario<0){
            this.salario = 0.0f;
        }
        else{
            this.salario = salario;
        }
        this.numFuncionarios++;
    }
    //getter
    public String getNome(){
        return nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public float getSalario(){
        return salario;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }
    //setter
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void setSalario(float salario){
        if(salario<0){
            this.salario = 0.0f;
        }
        else{
            this.salario = salario;
        }
    }

    public float getSalarioAnual(){
        return this.getSalario()*12;
    }
    
    public float setAumento(float aumento){
        if(aumento>0){
            this.setSalario(this.getSalario()+(this.getSalario()*aumento/100));
            return this.getSalario();
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        
        Exercicio15 e07 = new Exercicio15("Arthur", "Mello Cardoso", 2000.0f);
        System.out.println("Salário atual: "+e07.getSalario()); 
        System.out.println("Salário anual: "+ e07.getSalarioAnual()); 
        float aumento = e07.setAumento(10);
        if(aumento == -1){
            System.out.println("Porcentagem inválida para cadastrar o aumento de salário.");
        }
        else{
            System.out.println("Novo salário: "+aumento);
        }
        System.out.println("Número total de funcionários: "+e07.getNumFuncionarios());
    }
}
