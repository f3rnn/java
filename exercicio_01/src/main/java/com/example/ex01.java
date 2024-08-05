package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class ex01 
{
    public static void main( String[] args )
    {
        Scanner teclado = new Scanner(System.in);

        double valorParcela;

        System.out.println("informe o valor da compra: ");
        double valorDaCompra = teclado.nextDouble();

        valorParcela = valorDaCompra / 5;
        String mercado = "Mamão com Açúcar";

        System.out.println("valor da parcela: R$" + valorParcela);
        System.out.println("Mercado " + mercado);
    }
}
