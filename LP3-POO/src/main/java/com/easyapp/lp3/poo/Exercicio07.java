
package com.easyapp.lp3.poo;

/*
A fim de representar funcionários em uma empresa, crie uma classe chamada 
Funcionario que inclui as três informações a seguir como atributos:
- um primeiro nome,
- um sobrenome
- um salário mensal
Sua classe deve ter um construtor que inicializa os três atributos. Forneça os 
métodos getters e setters para cada atributo. Se o salário mensal não for 
positivo, configure-o como 0.0. Escreva um aplicativo de teste que demonstra as 
capacidades da classe. Crie duas instâncias da classe e exiba o salário anual de
cada instância. Então dê a cada empregado um aumento de 10% e exiba novamente o 
salário anual de cada empregado.
*/

public class Exercicio07 {
    
    private String nome;
    private String sobrenome;
    private float salario;
    
    public Exercicio07(String nome, String sobrenome, float salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        if(salario<0){
            this.salario = 0.0f;
        }
        else{
            this.salario = salario;
        }
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
        
        Exercicio07 e07 = new Exercicio07("Arthur", "Mello Cardoso", 2000.0f);
        System.out.println("Salário atual: "+e07.getSalario()); 
        System.out.println("Salário anual: "+ e07.getSalarioAnual()); 
        float aumento = e07.setAumento(10);
        if(aumento == -1){
            System.out.println("Porcentagem inválida para cadastrar o aumento de salário.");
        }
        else{
            System.out.println("Novo salário: "+aumento);
        }
        System.out.println(); 
    }
}
