package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class ex02 
{
    public static void main( String[] args )
    {
        Scanner teclado = new Scanner(System.in);

        int menorNumero;

        System.out.println("informe o primeiro número: ");
        int primeiroNumero = teclado.nextInt();
        System.out.println("informe o segundo número: ");
        int segundoNumero = teclado.nextInt();

        if (primeiroNumero > segundoNumero) {
            menorNumero = segundoNumero;
        } else {
            menorNumero = primeiroNumero;
        }

        System.out.println("menor número: " + menorNumero);
    }
}
