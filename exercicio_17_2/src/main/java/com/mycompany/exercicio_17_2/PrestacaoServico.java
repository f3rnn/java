/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_17_2;

/**
 *
 * @author aluno.den
 */
public class PrestacaoServico extends Juridica {
    private String contratoInicio;
    private String contratoFim;

    public PrestacaoServico(String contratoInicio, String contratoFim, String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, nome, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    public String getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(String contratoFim) {
        this.contratoFim = contratoFim;
    }

    public String getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(String contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    @Override
    public String toString() {
        return "\n===prestacao de servico===" + "\ncontrato inicio: " + contratoInicio + "\ncontrato fim: " + contratoFim + super.toString();
    }
    
    
}
