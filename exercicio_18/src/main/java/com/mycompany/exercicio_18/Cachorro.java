package com.mycompany.exercicio_18;


import com.mycompany.exercicio_18.Animal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno.den
 */
public class Cachorro implements Animal {

    @Override
    public String emitirSom() {
        return "woof woof";
    }

    @Override
    public String comer() {
        return "come racao";
    }
    
}
