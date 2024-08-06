/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_07;

/**
 *
 * @author aluno.den
 */
public class Exercicio_07 {

    public static void main(String[] args) {
        //instanciando um objeto
        Cliente clientes = new Cliente();
        
        //clientes.nome = "Marta";
        //clientes.idade = 18;
        
        clientes.setNome("Marta");
        clientes.setIdade(18);
                
        System.out.println("nome: " + clientes.getNome());
        System.out.println("idade: " + clientes.getIdade());
    }
}
