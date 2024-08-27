/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_20;

/**
 *
 * @author aluno.den
 */
public class Exercicio_20 {

    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao sub = new Subtracao();
        Multiplicacao multi = new Multiplicacao();
        Divisao div = new Divisao();
        
        System.out.println(soma.calcular(2, 2));
        System.out.println(sub.calcular(2, 2));
        System.out.println(multi.calcular(2, 2));
        System.out.println(div.calcular(2, 2));
    }
}
