/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_17_2;

/**
 *
 * @author aluno.den
 */
public class Exercicio_17_2 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("123", Sexo.MASCULINO, EstadoCivil.SOLTEIRO, "06/09/1969", "zezao", "71 9 9999-9998", "zezao@gmail.com",
                new Endereco("via rua alameda", "123", "ali na esquina", "40000-000", "salvador", UnidadeFederativa.BAHIA));
        PrestacaoServico servico = new PrestacaoServico("20/08/2024", "20/08/2025", "000/0001-000", "asjkdjas", "dejair", "71 9 9999-9999", "dejair@gmail.com",
                new Endereco("avenida rua alameda", "321", "onde o vento faz a curva", "40000-001", "salvador", UnidadeFederativa.BAHIA));
        
        System.out.println(cliente.toString());
        System.out.println(servico.toString());
    }
}
