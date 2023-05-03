
package com.easyapp.heranca;

import java.util.Date;

public class Funcionario {

    private String nome;
    private String cpf;
    private Date dataNascimento;
    private float salario;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public float getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
