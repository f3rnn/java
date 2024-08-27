/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_21;

/**
 *
 * @author aluno.den
 */
public class Exercicio_21 {

    public static void main(String[] args) {
        Motorista moto = new Motorista("abc123", "joao", "123456", "7891011",
                new Endereco("rua alameda", "123", "na esquina", "40.000-000", "salvador", UnidadeFederativa.BAHIA),
                Setor.OPERACOES, Sexo.MASCULINO, 1412, "06/09/1969");
        Advogado adv = new Advogado("12345", "joana", "654321", "1110987",
                new Endereco("alameda avenida", "321", "onde o vento faz curva", "40.000-000", "salvador", UnidadeFederativa.BAHIA),
                Setor.JURIDICO, Sexo.FEMININO, 5000, "11/09/1800");
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "zezao", "142536", "635241",
                new Endereco("rua avenida", "456", "onde juda bateu as botas", "40.000-000", "niteroi", UnidadeFederativa.RIO_DE_JANEIRO),
                Setor.MARKETING, Sexo.MASCULINO, 4500, "14/05/1988");
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "zezinha", "987654", "968574",
                new Endereco("avenida alameda", "478", "ali na esquina", "40.000-000", "sao paulo", UnidadeFederativa.SAO_PAULO),
                Setor.RECURSOS_HUMANOS, Sexo.FEMININO, 6000, "05/04/2003");
        
        System.out.println(moto.toString());
        System.out.println(adv.toString());
        System.out.println(gerente.toString());
        System.out.println(diretor.toString());
        
        diretor.admitir(adv);
        diretor.demitir(gerente);
    }
}
