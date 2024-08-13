/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_14;

/**
 *
 * @author aluno.den
 */
public class Exercicio_14 {

    public static void main(String[] args) {
        Pessoas pessoa = new Pessoas(007, "james bond", 37, "71999999998", "bonddotigrao@gmail.com", Sexo.MASCULINO,
        new Enderecos("rua", "001", "ali na esquina", "40000", "nao", UnidadeFederativa.BAHIA));
        
        System.out.println("~~ dados ~~");
        System.out.println("id: " + pessoa.getId());
        System.out.println("nome: " + pessoa.getNome());
        System.out.println("idade: " + pessoa.getIdade());
        System.out.println("telefone: " + pessoa.getTelefone());
        System.out.println("email: " + pessoa.getEmail());
        System.out.println("sexo: " + pessoa.getSexo().getTexto());
        System.out.println("\n~~ endereco ~~");
        System.out.println("logradouro: " + pessoa.getEndereco().getLogradouro());
        System.out.println("numero: " + pessoa.getEndereco().getNumero());
        System.out.println("complemento: " + pessoa.getEndereco().getComplemento());
        System.out.println("cep: " + pessoa.getEndereco().getCep());
        System.out.println("cidade: " + pessoa.getEndereco().getCidade());
        System.out.println("UF: " + pessoa.getEndereco().getUf().getSigla());
    }
}
