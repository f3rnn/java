/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_12;

/**
 *
 * @author aluno.den
 */
public class Memorias {
    private String marca;
    private String modelo;
    private int capacidadeDeArmazenamento;

    public Memorias(String marca, String modelo, int capacidadeDeArmazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(int capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    
    
}
