/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_16;

/**
 *
 * @author aluno.den
 */
public class Exercicio_16 {

    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("000", "zezao", "000.000.000-00", "123465", 5000);
        Engenheiro engenheiro = new Engenheiro("000", "dejair", "000.000.000-01", "123455", 4000);
        Medico medico = new Medico("000", "casa", "000.000.000-02", "123454", 3000);
        
        System.out.println(motoboy.toString());
        System.out.println(engenheiro.toString());
        System.out.println(medico.toString());
    }
}
