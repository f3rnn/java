/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_12_2;

/**
 *
 * @author aluno.den
 */
public class DispositivoArmazenamento extends Produto {
    private int capacidadeDeArmanezamento;
    private String tipoDeConexao;

    public DispositivoArmazenamento(int capacidadeDeArmanezamento, String tipoDeConexao, String marca, String modelo) {
        super(marca, modelo);
        this.capacidadeDeArmanezamento = capacidadeDeArmanezamento;
        this.tipoDeConexao = tipoDeConexao;
    }

    public String getTipoDeConexao() {
        return tipoDeConexao;
    }

    public void setTipoDeConexao(String tipoDeConexao) {
        this.tipoDeConexao = tipoDeConexao;
    }

    public int getCapacidadeDeArmanezamento() {
        return capacidadeDeArmanezamento;
    }

    public void setCapacidadeDeArmanezamento(int capacidadeDeArmanezamento) {
        this.capacidadeDeArmanezamento = capacidadeDeArmanezamento;
    }
    
}
