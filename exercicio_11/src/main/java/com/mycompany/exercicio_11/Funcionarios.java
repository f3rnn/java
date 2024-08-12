/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_11;

/**
 *
 * @author aluno.den
 */
public class Funcionarios {
    private int codigoDeFuncionario;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private ContaBancaria contaBanco;

    public Funcionarios(int codigoDeFuncionario, String nome, String endereco, String telefone, String email, ContaBancaria contaBanco) {
        this.codigoDeFuncionario = codigoDeFuncionario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contaBanco = contaBanco;
    }

    public ContaBancaria getContaBanco() {
        return contaBanco;
    }

    public void setContaBanco(ContaBancaria contaBanco) {
        this.contaBanco = contaBanco;
    }

    public int getCodigoDeFuncionario() {
        return codigoDeFuncionario;
    }

    public void setCodigoDeFuncionario(int codigoDeFuncionario) {
        this.codigoDeFuncionario = codigoDeFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
