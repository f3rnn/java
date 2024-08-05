package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class ex04 
{
    public static void main( String[] args )
    {
        Scanner teclado = new Scanner(System.in);
        String resultado;
        double media;

        System.out.println("digite a primeira nota: ");
        double primeiraNota = teclado.nextDouble();
        System.out.println("digite a segunda nota: ");
        double segundaNota = teclado.nextDouble();

        media = (primeiraNota + segundaNota) / 2;

        if (media >= 7) {
            resultado = "aprovado";
        } else if (media >= 5){
            resultado = "verificação suplementar";
        } else {
            resultado = "reprovado";
        }
        System.out.println("média: " + media);
        System.out.println("resultado: " + resultado);
    }
}
