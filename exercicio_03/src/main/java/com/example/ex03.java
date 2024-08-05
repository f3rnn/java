package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class ex03 
{
    public static void main( String[] args )
    {
        Scanner teclado = new Scanner(System.in);
        double media;
        String resultado;

        System.out.println("informe o nome do aluno: ");
        String nomeDoAluno = teclado.next();
        
        System.out.println("informe a primeira nota aluno: ");
        double primeiraNota = teclado.nextDouble();
        
        System.out.println("informe a segunda nota do aluno: ");
        double segundaNota = teclado.nextDouble();

        media = (primeiraNota + segundaNota) / 2;

        if (media >= 7) {
            resultado = "aprovado";
        } else {
            resultado = "reprovado";
        }

        System.out.println("nome: " + nomeDoAluno);
        System.out.println("média: " + media);
        System.out.println("situação: " + resultado);
    }
}
