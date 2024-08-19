/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_15;

/**
 *
 * @author aluno.den
 */
public class Exercicio_15 {

    public static void main(String[] args) {
        Fisica pessoaFisica = new Fisica("000.000.000-01", "00.000.000-0", "06/09/1969", "celso portioli", "71 9 9999-9998");
        Juridica pessoaJuridica = new Juridica("00.000.000/0001-00", "0000000000", "celso portioli", "71 9 9999-9998");
        
        
        System.out.println("nome: " + pessoaFisica.getNome());
        System.out.println("telefone: " + pessoaFisica.getTelefone());
        System.out.println("\ndados pessoa fisica:\n" + pessoaFisica);
        System.out.println("\ndados pessoa juridica:\n" + pessoaJuridica);
    }
}
