/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.exercicio_13;

/**
 *
 * @author aluno.den
 */
public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino");
    
    private String texto;

    private Sexo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
}
