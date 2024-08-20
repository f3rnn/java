/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_17_2;

/**
 *
 * @author aluno.den
 */
public abstract class Fisica extends Pessoa {
    protected Sexo sexo;
    protected EstadoCivil estadoCivil;
    protected String dataNascimento;

    public Fisica(Sexo sexo, EstadoCivil estadoCivil, String dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "\n===dados pessoa fisica===" + "\nsexo: " + sexo.getTexto() + "\nestado civil: " + estadoCivil.getTexto() + "\ndata de nascimento: " + dataNascimento + super.toString();
    }
    
    
}
