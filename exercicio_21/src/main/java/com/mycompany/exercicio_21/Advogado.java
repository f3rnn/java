/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_21;

/**
 *
 * @author aluno.den
 */
public class Advogado extends Funcionario {
    private String oab;

    public Advogado(String oab, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }


    @Override
    public double getSalarioFinal() {
        return this.getSalario();
    }
    
    @Override
    public String toString() {
        return "=== Advogado ===\n" + super.toString()+"\nsalario final: " + this.getSalarioFinal()+ "oab: " + oab;
    }
    
}
