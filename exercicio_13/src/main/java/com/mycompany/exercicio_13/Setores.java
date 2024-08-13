/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.exercicio_13;

/**
 *
 * @author aluno.den
 */
public enum Setores {
    FINANCEIRO("Financeiro"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    VENDAS("Vendas"),
    MARKETING("Marketing");
    
    private String funcao;

    private Setores(String funcao) {
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }
    
    
}
