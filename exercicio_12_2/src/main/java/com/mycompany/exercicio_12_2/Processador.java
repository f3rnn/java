/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_12_2;

/**
 *
 * @author aluno.den
 */
public class Processador extends Produto {
    private double frequencia;

    public Processador(double frequencia, String marca, String modelo) {
        super(marca, modelo);
        this.frequencia = frequencia;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }
    
}
