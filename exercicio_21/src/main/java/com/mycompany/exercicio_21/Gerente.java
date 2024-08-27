/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_21;

/**
 *
 * @author aluno.den
 */
public class Gerente extends CargoDeConfianca {

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal = super.salario * super.bonificacao.getValor();
        salarioFinal += super.salario;
        return salarioFinal;
    }
    
    @Override
    public String toString(){
        return "=== Gerente ===\n" + super.toString() + "\nsalario final: " + this.getSalarioFinal();
    }
    
}
