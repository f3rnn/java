/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_16;

/**
 *
 * @author aluno.den
 */
public class Medico extends Funcionario {
    private String crm;

    public Medico(String crm, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "\nDados do Medico:\n" + "nome: " + super.nome + "\nCPF: " + super.cpf + "\nRG: "+ super.rg + "\nsalario: R$" + super.salario + "\ncrm: " + crm;
    }
    
    
}
