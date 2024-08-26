/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_19;

/**
 *
 * @author aluno.den
 */
public class Motoboy extends Funcionario {
    private String carteiraDeHabilitacao;

    public Motoboy(String carteiraDeHabilitacao, String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return this.getSalarioBase();
    }
    
    @Override
    public String toString() {
        return "Motoboy:\n" + super.toString() + "\nsalario final: " +this.getSalarioFinal() + "\ncarteira de habilitacao: " + carteiraDeHabilitacao;
    }

    
}
