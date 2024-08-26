/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_19;

/**
 *
 * @author aluno.den
 */
public class Exercicio_19 {

    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("adjksaj", "joao", "06/09/1969", Sexo.MASCULINO, Setor.OPERACOES, 1412);
        Diretor diretor = new Diretor("dejair", "09/01/2001", Sexo.MASCULINO, Setor.FINANCEIRO, 5000);
        
        
        System.out.println(motoboy.toString());
        System.out.println(diretor.toString());
        
        diretor.demitir(motoboy);
    }
}
