/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_18;

/**
 *
 * @author aluno.den
 */
public class Exercicio_18 {

    public static void main(String[] args) {
        Cachorro toto = new Cachorro();
        Gato miau = new Gato();
        Galo galo = new Galo();
        Pato pato = new Pato();
        
        System.out.println("som: " + miau.emitirSom());
        System.out.println("alimentacao: " + miau.comer());
        System.out.println("som: " + toto.emitirSom());
        System.out.println("alimentacao: " + toto.comer());
        System.out.println("som: " + galo.emitirSom());
        System.out.println("alimentacao: " + galo.comer());
        System.out.println("som: " + pato.emitirSom());
        System.out.println("alimentacao: " + pato.comer());
        
    }
}
