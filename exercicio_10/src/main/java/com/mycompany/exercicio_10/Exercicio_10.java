/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_10;

/**
 *
 * @author aluno.den
 */
public class Exercicio_10 {

    public static void main(String[] args) {
        Veiculos veiculo = new Veiculos("BRA2E19", "rosa choque", 5, 54, 187, 9.4);
        Clientes cliente = new Clientes("godofredo", 40, "000.001.007-50", "rua das mariposas", "71 99999-9998");
        
        System.out.println("~~ carro ~~");
        System.out.println("placa: " + veiculo.getPlaca());
        System.out.println("cor: " + veiculo.getCor());
        System.out.println("numero de passageiros: " + veiculo.getNumeroDePassageiros());
        System.out.println("capacidade de tanque: " + veiculo.getCapacidadeDeTanque()+ " litros");
        System.out.println("velocidade maxima: " + veiculo.getVelocidadeMaxima() + " km/h");
        System.out.println("consumo medio: " + veiculo.getConsumoMedio() + " km/l");
        
        System.out.println("\n~~ cliente~~");
        System.out.println("nome: " + cliente.getNome());
        System.out.println("idade: " + cliente.getIdade());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("endereco: " + cliente.getEndereco());
        System.out.println("telefone: " + cliente.getTelefone());
    }
}
