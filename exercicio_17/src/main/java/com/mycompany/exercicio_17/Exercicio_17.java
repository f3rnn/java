/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_17;

/**
 *
 * @author aluno.den
 */
public class Exercicio_17 {

    public static void main(String[] args) {
        Juridica pessoaJuridica = new Juridica("0000/0001-00", "010101", "19/08/2021", "19/08/2024", 50000.0, 7, "zezao", "71 9 9999-9998",
                new Endereco("rua alameda", "123", "ali na esquina", "40.000-000", "salvador", UnidadeFederativa.BAHIA));
        Fisica pessoaFisica = new Fisica(Sexo.MASCULINO, "000.000.000-00", "00.000.000-00", "06/09/1969", 5000, 7, "dejair", "71 9 9999-9998",
                new Endereco("rua alameda", "123", "ali na esquina", "40.000-000", "salvador", UnidadeFederativa.BAHIA));
        
        System.out.println(pessoaFisica.toString());
        System.out.println(pessoaJuridica.toString());
    }
}
