/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_12_2;

/**
 *
 * @author aluno.den
 */
public class Memoria extends Produto {
    private int capacidadeDeMemoria;
    private int frequencia;

    public Memoria(int capacidadeDeMemoria, int frequencia, String marca, String modelo) {
        super(marca, modelo);
        this.capacidadeDeMemoria = capacidadeDeMemoria;
        this.frequencia = frequencia;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public int getCapacidadeDeMemoria() {
        return capacidadeDeMemoria;
    }

    public void setCapacidadeDeMemoria(int capacidadeDeMemoria) {
        this.capacidadeDeMemoria = capacidadeDeMemoria;
    }
    
    
}
