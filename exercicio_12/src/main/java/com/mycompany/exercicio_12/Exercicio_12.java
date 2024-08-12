/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_12;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Exercicio_12 {

    public static void main(String[] args) {       
        Processadores processador = new Processadores("intel", "i3 10100F", 4.3);
        Memorias memoria = new Memorias("corsair", "ddr4 8gb", 3333);
        
        System.out.println("~~ processador ~~");
        System.out.println("marca: " + processador.getMarca());
        System.out.println("modelo: " + processador.getModelo());
        System.out.println("frequencia: " + processador.getFrequencia() + " hZ");
        
        System.out.println("\n~~ memoria ~~");
        System.out.println("marca: " + memoria.getMarca());
        System.out.println("modelo: " + memoria.getModelo());
        System.out.println("capacidade de armazenamento: " + memoria.getCapacidadeDeArmazenamento() + " mZ");
    }
}
