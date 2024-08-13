/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_13;

/**
 *
 * @author aluno.den
 */
public class Exercicio_13 {

    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios("007", "ralucca", 500, Setores.MARKETING, Sexo.MASCULINO, 20);
        
        System.out.println("~~ dados do funcionario ~~");
        System.out.println("nome: " + funcionario.getNome());
        System.out.println("id: " + funcionario.getId());
        System.out.println("salario: R$ " + funcionario.getSalario());
        System.out.println("setor: " + funcionario.getSetor());
        System.out.println("sexo: " + funcionario.getSexo());
        System.out.println("idade: " + funcionario.getIdade());
    }
}
