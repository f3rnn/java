package com.example;

/**
 * Hello world!
 *
 */
public class metodos 
{
    public static void main( String[] args )
    {
        String nome = "Marta";
        String sobrenome = "Silveira";

        System.out.println("tamanho do nome: " + nome.length());
        System.out.println("tamanho do sobrenome: " + sobrenome.length());

        String nomeCompleto = nome.concat(" ").concat(sobrenome);

        System.out.println("concatenação maiúscula: " + nomeCompleto.toUpperCase());
        System.out.println("concatenação minúscula: " + nomeCompleto.toLowerCase());
    }
}
