/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_09;

/**
 *
 * @author aluno.den
 */
public class Exercicio_09 {

    public static void main(String[] args) {
        Pets petUm = new Pets("godofredo", 2, "srd", "grande", "srd");
        Pets petDois = new Pets("nelsinho", 8, "shitzsu", "pequeno", "pedigree");
        
        System.out.println("nome: " + petUm.getNome());
        System.out.println("idade: " + petUm.getIdade());
        System.out.println("raça: " + petUm.getRaca());
        System.out.println("porte: " + petUm.getPorte());
        System.out.println("alimentação: " + petUm.getAlimentacao() + "\n");
        System.out.println("nome: " + petDois.getNome());
        System.out.println("idade: " + petDois.getIdade());
        System.out.println("raça: " + petDois.getRaca());
        System.out.println("porte: " + petDois.getPorte());
        System.out.println("alimentação: " + petDois.getAlimentacao());
    }
}
