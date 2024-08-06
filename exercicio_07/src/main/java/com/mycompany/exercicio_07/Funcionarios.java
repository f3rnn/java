/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_07;

/**
 *
 * @author aluno.den
 */
public class Funcionarios {
    private String nome;
    private double salario;
    private String funcao;
    
    //construtor
    public Funcionarios(String nome, double salario, String funcao) {
        this.nome = nome;
        this.salario = salario;
        this.funcao = funcao;
    }
    
    //acessos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    
}
