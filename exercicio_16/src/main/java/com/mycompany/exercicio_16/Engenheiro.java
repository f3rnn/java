/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_16;

/**
 *
 * @author aluno.den
 */
public class Engenheiro extends Funcionario {
    private String crea;

    public Engenheiro(String crea, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "\nDados do Engenheiro:\n" + "nome: " + super.nome + "\nCPF: " + super.cpf + "\nRG: " + super.rg + "\nsalario: R$" + super.salario + "\ncrea: " + crea;
    }
    
    
}
