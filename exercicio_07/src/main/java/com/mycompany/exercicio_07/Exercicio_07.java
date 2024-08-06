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
        Cliente clientes = new Cliente("Marta", 18);
        Funcionarios funcionario = new Funcionarios("João", 1412, "Função");
        
        //clientes.nome = "Marta";
        //clientes.idade = 18;
        
        //clientes.setNome("Marta");
        //clientes.setIdade(18);
                
        System.out.println("nome: " + clientes.getNome());
        System.out.println("idade: " + clientes.getIdade());
        System.out.println("nome: " + funcionario.getNome());
        System.out.println("funcao: " + funcionario.getFuncao());
        System.out.println("salario: " + funcionario.getSalario());
    }
}
