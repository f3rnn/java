/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_19;

/**
 *
 * @author aluno.den
 */
public class Diretor extends Funcionario implements Contratacao{

    private final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal = super.salarioBase * PREMIO;
        salarioFinal += super.salarioBase;
        return salarioFinal;
    }
    
    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("\n=== Admitindo funcionario ===");
        System.out.println("dados do funcionario: ");
        System.out.println(funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("\n=== Demitindo funcionario ===");
        System.out.println("dados do funcionario: ");
        System.out.println(funcionario.toString());
    }
        
    @Override
    public String toString() {
        return "\nDiretor:\n"+ super.toString() + "\npremio: " + PREMIO + "%" + "\nsalario final: " + this.getSalarioFinal();
    }

    
}
