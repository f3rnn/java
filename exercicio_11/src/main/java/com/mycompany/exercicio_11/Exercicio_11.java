/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_11;

/**
 *
 * @author aluno.den
 */
public class Exercicio_11 {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("nubank", "000-1", "15481-1", "universitaria", 0, 50);
        Funcionarios funcionario = new Funcionarios(007, "Bond James Bond", "via rua alemada", "71999999998", "bonddotrigao@gmail.com", conta);
        
        // Funcionarios funcionario = new Funcionarios(007, "Bond James Bond", "via rua alemada", "71999999998", "bonddotrigao@gmail.com",
        // new ContaBancaria "nubank", "000-1", "15481-1", "universitaria", 0, 50);
        
        System.out.println("~~ dados do funcionario ~~: ");
        System.out.println("nome: " + funcionario.getNome());
        System.out.println("\n~~ dados da conta bancaria ~~: ");
        System.out.println("banco: " + funcionario.getContaBanco().getBanco());
        System.out.println("agencia: " + funcionario.getContaBanco().getAgencia());
    }
}
